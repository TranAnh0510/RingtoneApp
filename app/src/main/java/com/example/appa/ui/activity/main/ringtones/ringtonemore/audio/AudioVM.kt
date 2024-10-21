package com.example.appa.ui.activity.main.ringtones.ringtonemore.audio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.liveData
import com.example.appa.data.model.ItemAudio
import com.example.appa.data.repository.audio.AudioRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.dialog.TYPE_AZ
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel class responsible for managing audio data in the UI.
 * It interacts with the AudioRepo to retrieve audio data and exposes LiveData
 * to observe changes in the audio data.
 * @param audioRepo The repository for handling audio data operations.
 * @author AnhTTH
 */
@HiltViewModel
class AudioVM @Inject constructor(private val audioRepo: AudioRepo) : BaseViewModel() {
    // Variables for sorting audio data
    var isAscending = true
    var typeSort = TYPE_AZ

    // LiveData to observe changes in the audio data
    private val _allAudioMutableLiveData: MutableLiveData<PagingData<ItemAudio>> = MutableLiveData()
    val allAudioLiveData: LiveData<PagingData<ItemAudio>>
        get() = _allAudioMutableLiveData

    /**
     * Retrieves all audio data from the repository and updates the LiveData with the latest data.
     * @author AnhTTH
     */
    fun getAllAudio() {
        viewModelScope.launch(Dispatchers.IO) {
            // Lấy ra data audio
            val pagingSource = audioRepo.getGalleryAudioPagingSource(typeSort, isAscending)
            Pager(
                config = PagingConfig(
                    pageSize = 10,
                    enablePlaceholders = false,
                    prefetchDistance = 5,
                    initialLoadSize = 15
                ),
                pagingSourceFactory = { pagingSource }
            ).flow
                .distinctUntilChanged().catch {
                    it.printStackTrace()
                }.cachedIn(viewModelScope).collectLatest{
                _allAudioMutableLiveData.postValue(it)
            }
        }
    }
}