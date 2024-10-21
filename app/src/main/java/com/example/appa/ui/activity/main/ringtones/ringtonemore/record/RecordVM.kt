package com.example.appa.ui.activity.main.ringtones.ringtonemore.record

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.data.model.ItemRecordingUI
import com.example.appa.data.repository.recording.RecordingRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.base.toMutableListLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for managing recorded audio data.
 * @param recordingRepo The repository for accessing recorded audio data.
 * @author AnhTTH
 */
@HiltViewModel
class RecordVM @Inject constructor(private val recordingRepo: RecordingRepo) : BaseViewModel() {
    private val _dataRecordMutableLiveData: MutableLiveData<List<ItemRecordingUI>> =
        MutableLiveData()
    val dataRecordListLiveData: LiveData<List<ItemRecordingUI>>
        get() = _dataRecordMutableLiveData

    /**
     * Retrieves the current value of data record list.
     * @author AnhTTH
     */
    private fun getValueRecord() = _dataRecordMutableLiveData.toMutableListLiveData { it.copy() }

    /**
     * Retrieves recorded audio data from the repository and updates LiveData.
     * @param context The application context.
     * @author AnhTTH
     */
    fun getDataRecord(context: Context) = viewModelScope.launch(
        Dispatchers.IO
    ) {
        recordingRepo.getListRecording(context).let { allDataImage ->
            val temp = allDataImage.toMutableList()
            temp.postValueDataImage()
        }
    }

    /**
     * Posts a new value to the LiveData holding recorded audio data.
     * @author AnhTTH
     */
    private fun List<ItemRecordingUI>.postValueDataImage() {
        _dataRecordMutableLiveData.postValue(this)
    }

    /**
     * Checks or unchecks a recorded audio item based on its ID.
     * @param idRecord The ID of the recorded audio item.
     * @author AnhTTH
     */
    fun checkSelectRecord(idRecord: Int) = viewModelScope.launch(Dispatchers.IO) {
        getValueRecord()?.let { temp ->
            temp.forEach { item ->
                if (item.id == idRecord) {
                    // Toggles the selection state of the item
                    item.isSelect = !item.isSelect
                } else {
                    // Unchecks any previously checked item
                    if (item.isSelect) {
                        item.isSelect = false
                    }
                }
            }
            // Posts the updated list of recorded audio data to LiveData
            _dataRecordMutableLiveData.postValue(temp)
        }
    }

}