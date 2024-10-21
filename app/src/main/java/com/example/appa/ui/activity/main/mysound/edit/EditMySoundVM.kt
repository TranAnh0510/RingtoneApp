package com.example.appa.ui.activity.main.mysound.edit

import android.content.Context
import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.data.model.ItemMySoundUI
import com.example.appa.data.repository.mysound.MySoundRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.data.repository.file.FileRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
/**
 * ViewModel class for managing editing operations related to user's sound recordings.
 * Uses Hilt for dependency injection to provide FileRepo and MySoundRepo dependencies.
 * @author AnhTTH
 */
@HiltViewModel
class EditMySoundVM @Inject constructor(
    private val fileRepo: FileRepo,
    private val mySoundRepo: MySoundRepo
) : BaseViewModel() {

    private var _durationMutableLiveData: MutableLiveData<Long> = MutableLiveData()
    /**
     * LiveData for observing the duration of a sound recording.
     * @author AnhTTH
     */
    val durationLiveData: LiveData<Long>
        get() = _durationMutableLiveData

    private var _idItemMySoundMutableLiveData: MutableLiveData<Long> = MutableLiveData()
    /**
     * LiveData for observing the ID of a sound recording item.
     * @author AnhTTH
     */
    val idItemMySoundLiveData: LiveData<Long>
        get() = _idItemMySoundMutableLiveData


    private var _pathMutableLiveData: MutableLiveData<String> = MutableLiveData()
    /**
     * LiveData for observing the file path of a sound recording.
     * @author AnhTTH
     */
    val pathLiveData: LiveData<String>
        get() = _pathMutableLiveData
    /**
     * Retrieves the duration of a sound recording from the provided URI asynchronously.
     * @param context The context used for retrieving the duration.
     * @param uri The URI of the sound recording.
     * @author AnhTTH
     */
    fun getDurationFromUri(context: Context, uri: Uri) = viewModelScope.launch(Dispatchers.IO) {
        fileRepo.getDurationFromUri(context, uri).let {
                _durationMutableLiveData.postValue(it)
            }
    }
    /**
     * Asynchronously retrieves the file path corresponding to the provided URI.
     * @param context The context used for retrieving the file path.
     * @param uri The URI for which the file path is to be retrieved.
     * @author AnhTTH
     */
    fun getPathFromUri(context: Context, uri: Uri) = viewModelScope.launch(Dispatchers.IO) {
        fileRepo.getPathFromUri(context, uri).let {
                _pathMutableLiveData.postValue(it)
            }
    }
    /**
     * Inserts a new sound recording item into the repository.
     * Asynchronously performs the insertion operation and updates the LiveData with the ID of the inserted item.
     * @param itemMySoundUI The sound recording item to be inserted.
     * @author AnhTTH
     */
    fun insertMySound(itemMySoundUI: ItemMySoundUI) = viewModelScope.launch(Dispatchers.IO) {
        mySoundRepo.insertMySound(itemMySoundUI)
            .let {
                _idItemMySoundMutableLiveData.postValue(it)
            }
    }

}