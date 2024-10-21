package com.example.appa.ui.activity.main.ringtones.category

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.musicserver.MusicServerUI
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
 * ViewModel class for managing category-related operations.
 * Uses Hilt for dependency injection to provide dependencies for MusicServerRepo, RecentRepo, and FavoriteRepo.
 * @author AnhTTH
 */
@HiltViewModel
class CategoryVM @Inject constructor(
    private val musicServerRepo: MusicServerRepo,
    private val recentRepo: RecentRepo,
    private val favoriteRepo: FavoriteRepo,
) : BaseViewModel() {

    private val _categoryMutableLiveData: MutableLiveData<List<MusicServerUI>> = MutableLiveData()

    /**
     * LiveData for observing the list of music servers categorized by a specific category.
     * @author AnhTTH
     */
    val categoryLiveData: LiveData<List<MusicServerUI>>
        get() = _categoryMutableLiveData

    private fun getValueCategory() = _categoryMutableLiveData.toMutableListLiveData { it.copy() }

    /**
     * Retrieves data for a specific category from the repositories asynchronously.
     * Combines the list of all music servers with the list of favorite items to mark favorite music.
     * @param category The category for which the data is to be retrieved.
     * @author AnhTTH
     */
    fun getDataCategory(category: String) = viewModelScope.launch(Dispatchers.IO) {
        val favorites = favoriteRepo.getALlFavorite()
        val allMusic = musicServerRepo.getALlListMusic(category)
        val markedMusic = allMusic.toMutableList().markFavorites(favorites)
        markedMusic.toMutableList().postValueCategory()
    }

    /**
     * Inserts a recent item into the RecentRepo asynchronously.
     * Posts an update event to notify subscribers about the recent item insertion.
     * @param itemRecent The recent item to be inserted.
     * @author AnhTTH
     */

    fun insertRecent(itemRecent: ItemRecent) = viewModelScope.launch(Dispatchers.IO) {
        recentRepo.insertRecent(itemRecent).let {
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_RECENT))
        }
    }

    /**
     * Inserts a new favorite item into the FavoriteRepo asynchronously.
     * Updates the corresponding category's LiveData to mark the item as favorite.
     * Posts an update event to notify subscribers about the favorite item insertion.
     * @param itemFavoriteUI The favorite item to be inserted.
     * @author AnhTTH
     */
    fun insertFavorite(itemFavoriteUI: ItemFavoriteUI) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.insertFavorite(itemFavoriteUI).let {
            getValueCategory()?.let { temp ->
                temp.firstOrNull { it.path == itemFavoriteUI.path }?.let {
                    it.isFavorite = true
                    temp.toMutableList().postValueCategory()
                }
            }
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
        }
    }

    /**
     * Deletes a favorite item from the FavoriteRepo asynchronously.
     * Updates the corresponding category's LiveData to mark the item as not favorite.
     * Posts an update event to notify subscribers about the favorite item deletion.
     * @param path The path of the favorite item to be deleted.
     * @author AnhTTH
     */
    fun deleteFavorite(path: String) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.deleteFavorite(path).let {
            getValueCategory()?.let { temp ->
                temp.firstOrNull { it.path == path }?.let {
                    it.isFavorite = false
                    temp.toMutableList().postValueCategory()
                }
            }
        }
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
    }

    /**
     * Updates the download path of a music item asynchronously.
     * Updates the LiveData of all categories with the new download path.
     * Posts update events to notify subscribers about the path download updates.
     * @param context The context used for updating the download path.
     * @param pathDownload The new download path.
     * @param path The original path of the music item.
     * @author AnhTTH
     */
    fun updatePathDownload(context: Context, pathDownload: String, path: String) =
        viewModelScope.launch(Dispatchers.IO) {
            musicServerRepo.updatePathDownload(context, pathDownload, path).let {
                    if (it) {
                        getValueCategory()?.let { listAllCate ->
                            listAllCate.firstOrNull { it.path == path }?.let { item ->
                                item.pathDownload = pathDownload
                            }
                            listAllCate.postValueCategory()
                            EventBus.getDefault()
                                .post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_FAVOURITE))
                            EventBus.getDefault()
                                .post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_RECENT))
                        }
                    }
                }
        }

    /**
     * Marks favorite music items in the list of music items.
     * Returns a list of music items with favorites marked.
     * @param favourites The list of favorite music items.
     * @return The list of music items with favorites marked.
     * @author AnhTTH
     */
    private fun List<MusicServerUI>.markFavorites(favourites: List<ItemFavoriteUI>): List<MusicServerUI> {
        return map { detail ->
            favourites.find { it.path == detail.path }?.let {
                detail.isFavorite = true
                detail
            } ?: detail
        }
    }

    /**
     * Posts the updated list of music categories to the LiveData.
     * Sorts the list by name and updates image categories before posting.
     * @author AnhTTH
     */
    private fun MutableList<MusicServerUI>.postValueCategory() {
        this.forEach {
            it.image = it.category.setImageCategory()
        }
        this.sortBy { it.name }
        _categoryMutableLiveData.postValue(this)
    }

}