package com.example.appa.ui.activity.main.favorite

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
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
 * ViewModel responsible for managing favorite items.
 * @author AnhTTH
 */

@HiltViewModel
class FavoriteVM @Inject constructor(
    private val musicServerRepo: MusicServerRepo,
    private val favoriteRepo: FavoriteRepo,
    private val recentRepo: RecentRepo,
) : BaseViewModel() {

    private val _favoritesMutableLiveData: MutableLiveData<List<ItemFavoriteUI>> = MutableLiveData()

    /**
     * Returns the LiveData object containing the list of favorite items.
     * @author AnhTTH
     */
    private fun getValueFavourite() = _favoritesMutableLiveData.toMutableListLiveData { it.copy() }
    val favoriteLiveData: LiveData<List<ItemFavoriteUI>>
        get() = _favoritesMutableLiveData

    /**
     * Retrieves all favorite items and updates the LiveData.
     * @author AnhTTH
     */
    fun getAllFavorite() = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.getALlFavorite().let { listFavorite ->
            listFavorite.toMutableList().postValueFavorite()
        }
    }

    /**
     * Deletes the favorite item with the given path.
     * @param path The path of the favorite item to be deleted.
     * @author AnhTTH
     */
    fun deleteFavorite(path: String) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.deleteFavorite(path)
        (getValueFavourite() ?: mutableListOf()).let { temp ->
            temp.indexOfFirst { it.path == path }.let { index ->
                temp.removeAt(index)
                temp.postValueFavorite()
            }
        }

    }

    /**
     * Inserts a recent item into the repository and posts an update event.
     * @param itemRecent The recent item to be inserted.
     * @author AnhTTH
     */
    fun insertRecent(itemRecent: ItemRecent) = viewModelScope.launch(Dispatchers.IO) {
        recentRepo.insertRecent(itemRecent)
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_RECENT))
    }

    /**
     * Updates the download path for the specified item.
     * @param context      The application context.
     * @param pathDownload The new download path.
     * @param path         The path of the item to be updated.
     * @author AnhTTH
     */
    fun updatePathDownload(context: Context, pathDownload: String, path: String) =
        viewModelScope.launch(Dispatchers.IO) {
            musicServerRepo.updatePathDownload(context, pathDownload, path).let {
                getValueFavourite()?.let { listAllCate ->
                    listAllCate.firstOrNull { it.path == path }?.let { item ->
                        item.pathDownload = pathDownload
                    }
                    listAllCate.postValueFavorite()
                    EventBus.getDefault()
                        .post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_FAVOURITE))
                    EventBus.getDefault()
                        .post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_RECENT))
                }
            }
        }

    /**
     * Posts the updated list of favorite items to the LiveData.
     * @author AnhTTH
     */
    private fun MutableList<ItemFavoriteUI>.postValueFavorite() {
        this.forEach {
            it.image = it.category.setImageCategory()
        }
        this.sortBy { it.category }
        _favoritesMutableLiveData.postValue(this)
    }

}