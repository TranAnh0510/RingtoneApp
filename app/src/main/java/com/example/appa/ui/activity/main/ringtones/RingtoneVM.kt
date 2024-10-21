package com.example.appa.ui.activity.main.ringtones

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.musicserver.MusicServerCategoriesUI
import com.example.appa.data.repository.favorite.FavoriteRepo
import com.example.appa.data.repository.recent.RecentRepo
import com.example.appa.data.repository.server.MusicServerRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.base.toMutableListLiveData
import com.example.appa.util.setImageCategory
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import javax.inject.Inject

/**
 * ViewModel class for managing ringtone-related data and operations.
 * @property recentRepo The repository for recent items.
 * @property musicServerRepo The repository for music server operations.
 * @property favoriteRepo The repository for favorite items.
 * @author AnhTTH
 */
@HiltViewModel
class RingtoneVM @Inject constructor(
    private val recentRepo: RecentRepo,
    private val musicServerRepo: MusicServerRepo,
    private val favoriteRepo: FavoriteRepo,
    private var application: Application

) : BaseViewModel() {

    private val _recentMutableLiveData: MutableLiveData<List<ItemRecent>> = MutableLiveData()

    /**
     * Returns a [MutableLiveData] object containing a list of recent items.
     * @return A [MutableLiveData] object containing a list of recent items.
     * @author AnhTTH
     */
    private fun getValueRecent() = _recentMutableLiveData.toMutableListLiveData { it.copy() }
    val recentLiveData: LiveData<List<ItemRecent>>
        get() = _recentMutableLiveData

    private val _categoryMutableLiveData: MutableLiveData<List<MusicServerCategoriesUI>> =
        MutableLiveData()

    /**
     * Returns a [MutableLiveData] object containing a list of music server categories.
     * @return A [MutableLiveData] object containing a list of music server categories.
     * @author AnhTTH
     */
    val categoryLiveData: LiveData<List<MusicServerCategoriesUI>>
        get() = _categoryMutableLiveData

    /**
     * Retrieves all recent items from the repository and updates the corresponding LiveData.
     * @author AnhTTH
     */
    fun getAllRecent() = viewModelScope.launch(Dispatchers.IO) {
        recentRepo.getALlRecent().toMutableList().postValueRecent()

    }

    /**
     * Retrieves all music server categories from the repository and updates the corresponding LiveData.
     * @author AnhTTH
     */
    fun getAllCategory() = viewModelScope.launch(Dispatchers.IO) {
        musicServerRepo.getALlCategory(application).toMutableList().postValueCategory()

    }

    /**
     * Updates the time of a recent item in the repository and LiveData.
     * @param path The path of the recent item.
     * @author AnhTTH
     */
    fun updateTimeRecent(path: String) = viewModelScope.launch(Dispatchers.IO) {
        val currentTime = System.currentTimeMillis()
        recentRepo.updateTimeRecent(currentTime, path).let {
            if (it) {
                getValueRecent()?.let { listRecent ->
                    listRecent.firstOrNull { it.path == path }?.let { item ->
                        item.timeAdd = currentTime
                        listRecent.postValueRecent()
                    }
                }
            }
        }

    }

    /**
     * Extension function to post the value of a list of [MusicServerCategoriesUI] to the corresponding LiveData.
     * @author AnhTTH
     */
    private fun MutableList<MusicServerCategoriesUI>.postValueCategory() {
        this.forEach {
            it.image = it.name.setImageCategory()

        }
        this.sortBy { it.name }
        _categoryMutableLiveData.postValue(this)
    }

    /**
     * Extension function to post the value of a list of [ItemRecent] to the corresponding LiveData.
     * @author AnhTTH
     */
    private fun MutableList<ItemRecent>.postValueRecent() {
        this.forEach {
            it.image = it.category.setImageCategory()
        }
        this.sortByDescending { it.timeAdd }
        _recentMutableLiveData.postValue(this)
    }

    /**
     * Inserts a favorite item into the repository and updates the LiveData.
     * @param itemFavoriteUI The favorite item to be inserted.
     * @author AnhTTH
     */
    fun insertFavorite(itemFavoriteUI: ItemFavoriteUI) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.insertFavorite(itemFavoriteUI)
        getValueRecent()?.let { temp ->
            temp.firstOrNull { it.path == itemFavoriteUI.path }?.let {
                it.isFavorite = true
                temp.toMutableList().postValueRecent()
            }
        }
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))

    }

    /**
     * Deletes a favorite item from the repository and updates the LiveData.
     * @param path The path of the favorite item to be deleted.
     * @author AnhTTH
     */
    fun deleteFavorite(path: String) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.deleteFavorite(path)
        getValueRecent()?.let { temp ->
            temp.firstOrNull { it.path == path }?.let {
                it.isFavorite = false
                temp.toMutableList().postValueRecent()
            }
        }
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
    }

}
