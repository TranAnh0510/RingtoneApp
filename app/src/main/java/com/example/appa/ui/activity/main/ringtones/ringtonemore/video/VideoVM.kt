package com.example.appa.ui.activity.main.ringtones.ringtonemore.video

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.liveData
import com.example.appa.data.repository.video.VideoRepo
import com.example.appa.data.repository.video.model.ItemVideo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.dialog.TYPE_AZ
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for managing video data.
 * @param videoRepo The repository for accessing video data.
 * @author AnhTTH
 */
@HiltViewModel

class VideoVM @Inject constructor(private val videoRepo: VideoRepo) : BaseViewModel() {
    // Flag indicating whether sorting is in ascending order
    var isAscending = true

    // Type of sorting
    var typeSort = TYPE_AZ

    // LiveData holding all video data
    private val _allVideoMutableLiveData: MutableLiveData<PagingData<ItemVideo>> = MutableLiveData()
    val allVideoLiveData: LiveData<PagingData<ItemVideo>>
        get() = _allVideoMutableLiveData
//    private val videoDataMap: MutableMap<String, PagingData<ItemVideo>> = mutableMapOf()

    /**
     * Retrieves all video data.
     * @author AnhTTH
     */
    fun getAllVideo() {
        viewModelScope.launch(Dispatchers.IO) {
            val pagingSource = videoRepo.getGalleryVideoPagingSource(typeSort, isAscending)
            Pager(
                config = PagingConfig(
                    pageSize = 10,
                    enablePlaceholders = false,
                    prefetchDistance = 5,
                    initialLoadSize = 10
                ),
                pagingSourceFactory = { pagingSource }
            ).flow.cachedIn(viewModelScope).collect{
                _allVideoMutableLiveData.postValue(it)
            }



        }
    }

}