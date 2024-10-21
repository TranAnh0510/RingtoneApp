package com.example.appa.ui.activity.main.search

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.common.Constant
import com.example.appa.common.MessageEvent
import com.example.appa.data.model.ItemFavoriteUI
import com.example.appa.data.model.ItemRecent
import com.example.appa.data.model.ItemRecommend
import com.example.appa.data.model.musicserver.MusicServerUI
import com.example.appa.data.repository.favorite.FavoriteRepo
import com.example.appa.data.repository.recent.RecentRepo
import com.example.appa.data.repository.search.SearchRepo
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
 * ViewModel for managing search-related operations and data.
 * @author AnhTTh
 */
@HiltViewModel
class SearchVM @Inject constructor(
    private val musicServerRepo: MusicServerRepo,
    private val searchRepo: SearchRepo,
    private val recentRepo: RecentRepo,
    private val favoriteRepo: FavoriteRepo,

    ) : BaseViewModel() {
    /**
     * LiveData for recommended items.
     * @author AnhTTH
     */
    private val _recommendMutableLiveData: MutableLiveData<List<ItemRecommend>> = MutableLiveData()
    val recommendLiveData: LiveData<List<ItemRecommend>>
        get() = _recommendMutableLiveData

    /**
     * Gets a copy of the list of music server UI items.
     * @author AnhTTH
     */
    private fun getValueSearchDetail() =
        _listMusicMutableLiveData.toMutableListLiveData { it.copy() }

    /**
     * LiveData for the list of music server UI items.
     * @author AnhTTh
     */
    private val _listMusicMutableLiveData: MutableLiveData<List<MusicServerUI>> = MutableLiveData()
    val listMusicLiveData: LiveData<List<MusicServerUI>>
        get() = _listMusicMutableLiveData

    /**
     * Fetches recommended data from the search repository.
     * @param context the context in which the function is called
     * @author AnhTTH
     */
    fun getDataRecommend(context: Context) = viewModelScope.launch(
        Dispatchers.IO
    ) {
        searchRepo.getALlRecommend(context).let { allDataImage ->
            val temp = allDataImage.toMutableList()
            temp.postValueDataTextSearch()
        }
    }

    /**
     * Posts the list of recommended items to the MutableLiveData.
     * @author AnhTTH
     */
    private fun List<ItemRecommend>.postValueDataTextSearch() {
        _recommendMutableLiveData.postValue(this)
    }

    /**
     * Searches for music with the specified query.
     * @param context the context in which the function is called
     * @param query the search query
     * @author AnhTTH
     */
    fun searchMusicWithKey(context: Context, query: String) =
        viewModelScope.launch(Dispatchers.IO) {
            val favourites = favoriteRepo.getALlFavorite()
            val listSearch = musicServerRepo.getListMusicSearch(context, query)
            val updatedListSearch = listSearch.toMutableList().markFavorites(favourites)
            updatedListSearch.postValueSearch()

        }

    /**
     * Inserts a recent item into the database.
     * @param itemRecent the recent item to insert
     * @author AnhTTh
     */
    fun insertRecent(itemRecent: ItemRecent) = viewModelScope.launch(Dispatchers.IO) {
        recentRepo.insertRecent(itemRecent).let {
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_RECENT))
        }
    }

    /**
     * Inserts a favorite item into the database.
     * @param itemFavoriteUI the favorite item to insert
     * @author AnhTTH
     */
    fun insertFavorite(itemFavoriteUI: ItemFavoriteUI) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.insertFavorite(itemFavoriteUI).let {
            getValueSearchDetail()?.let { temp ->
                temp.firstOrNull { it.path == itemFavoriteUI.path }?.let {
                    it.isFavorite = true
                    temp.postValueSearch()
                }
            }
            EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
        }
    }

    /**
     * Deletes a favorite item from the database.
     * @param path the path of the favorite item to delete
     * @author AnhTTH
     */
    fun deleteFavorite(path: String) = viewModelScope.launch(Dispatchers.IO) {
        favoriteRepo.deleteFavorite(path).let {
            getValueSearchDetail()?.let { temp ->
                temp.firstOrNull { it.path == path }?.let {
                    it.isFavorite = false
                    temp.postValueSearch()
                }
            }
        }
        EventBus.getDefault().post(MessageEvent(Constant.EVENT_UPDATE_FAVORITE))
    }

    /**
     * Marks the favorite items in the list of music server UI items.
     * @param favourites the list of favorite items
     * @return the updated list of music server UI items
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
     * Updates the download path for a music item.
     * @param context the context in which the function is called
     * @param pathDownload the new download path
     * @param path the original path of the music item
     * @author AnhTTH
     */
    fun updatePathDownload(context: Context, pathDownload: String, path: String) =
        viewModelScope.launch(Dispatchers.IO) {
            musicServerRepo.updatePathDownload(context, pathDownload, path).let {
                if (it) {
                    getValueSearchDetail()?.let { listAllCate ->
                        listAllCate.firstOrNull { it.path == path }?.let { item ->
                            item.pathDownload = pathDownload
                        }
                        listAllCate.postValueSearch()
                        EventBus.getDefault()
                            .post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_FAVOURITE))
                        EventBus.getDefault()
                            .post(MessageEvent(Constant.EVENT_UPDATE_PATH_DOWNLOAD_RECENT))
                    }
                }
            }
        }

    /**
     * Posts the updated list of music server UI items.
     * @author AnhTTH
     */
    private fun List<MusicServerUI>.postValueSearch() {
        this.forEach {
            it.image = (it.category).setImageCategory()
        }
        _listMusicMutableLiveData.postValue(this.toMutableList().sortedBy { it.name })
    }


}