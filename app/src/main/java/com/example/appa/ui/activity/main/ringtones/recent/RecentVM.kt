package com.example.appa.ui.activity.main.ringtones.recent

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.repository.recent.RecentRepo
import com.example.appa.data.repository.favorite.FavoriteRepo
import com.example.appa.data.repository.server.MusicServerRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.base.toMutableListLiveData
import com.example.appa.util.setImageCategory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

/**
 * manages the data and logic related to the list of recent items
 * @author AnhTTH
 */
@HiltViewModel
class RecentVM @Inject constructor(
    private val musicServerRepo: MusicServerRepo,
    private val recentRepo: RecentRepo,
    private val favoriteRepo: FavoriteRepo
) : BaseViewModel() {
    /**
     * MutableLiveData to store a list of recent items.
     * @author AnhTTH
     */
    private val _dataRecentMutableLiveData: MutableLiveData<List<ItemRecent>> =
        MutableLiveData()

    /**
     * LiveData to observe from outside this class
     * @author AnhTTH
     */
    val dataRecentListLiveData: LiveData<List<ItemRecent>>
        get() = _dataRecentMutableLiveData

    private fun getValueDataRecent() =
        _dataRecentMutableLiveData.toMutableListLiveData { it.copy() }

    /**
     * Get data from repository in background thread
     * @author AnhTTH
     */
    fun getDataRecent() = viewModelScope.launch(
        Dispatchers.IO
    ) {
        val favourites = favoriteRepo.getALlFavorite()
        val recentList = recentRepo.getALlRecent()
        val listMusic = recentList.toList().markFavorites(favourites)

        listMusic.toMutableList().postValueRecent()
    }

    /**
     * adds the isFavorite attribute to recent items if they are in the favorites list
     * @author AnhTTH
     */
    private fun List<ItemRecent>.markFavorites(favourites: List<ItemFavoriteUI>): List<ItemRecent> {
        return map { detail ->
            favourites.find { it.path == detail.path }?.let {
                detail.isFavorite = true
                detail
            } ?: detail
        }
    }

    /**
     * handles adding favorites into database
     * @author AnhTTH
     */
    fun insertFavorite(itemFavoriteUI: ItemFavoriteUI) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.insertFavorite(itemFavoriteUI)

        getValueDataRecent()?.let { temp ->
            temp.firstOrNull { it.path == itemFavoriteUI.path }?.let {
                it.isFavorite = true
                temp.toMutableList().postValueRecent()
            }
        }

        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
    }

    /**
     * remove favorites from database using path
     * @author AnhTTH
     */
    fun deleteFavorite(path: String) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.deleteFavorite(path)

        getValueDataRecent()?.let { temp ->
            temp.firstOrNull { it.path == path }?.let {
                it.isFavorite = false
                temp.toMutableList().postValueRecent()
            }
        }

        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
    }

    /**
     * Update the download path in the database
     * @author AnhTTH
     */
    fun updatePathDownload(context: Context, pathDownload: String, path: String) =
        viewModelScope.launch(Dispatchers.IO) {
            val success = musicServerRepo.updatePathDownload(context, pathDownload, path)

            if (success) {
                getValueDataRecent()?.let { listAllCate ->
                    listAllCate.firstOrNull { it.path == path }?.let { item ->
                        item.pathDownload = pathDownload
                    }
                    listAllCate.postValueRecent()
                    EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_FAVOURITE))
                    EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_RECENT))
                }
            }
        }

    /**
     * recentRepo's insertRecent method to add a recent item (itemRecent) to the database
     * @author AnhTTH
     */
    fun insertRecent(itemRecent: ItemRecent) = viewModelScope.launch(Dispatchers.IO) {
        recentRepo.insertRecent(itemRecent)
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_RECENT))
    }

    /**
     * Update the value for itemRecent
     * @author AnhTTH
     */
    private fun MutableList<ItemRecent>.postValueRecent() {
        this.forEach {
            it.image = (it.category).setImageCategory()
        }
        this.sortByDescending { it.timeAdd }
        _dataRecentMutableLiveData.postValue(this.distinctBy { it.path }.reversed())
    }

}