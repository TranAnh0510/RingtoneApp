package com.example.appa.ui.activity.main.mysound

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.data.model.ItemMySoundUI
import com.example.appa.data.repository.mysound.MySoundRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.base.toMutableListLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel class for managing sound-related data and operations.
 * This ViewModel is scoped to the Hilt dependency injection framework.
 * @author AnhTTH
 */
@HiltViewModel
class MySoundVM @Inject constructor(private val mySoundRepo: MySoundRepo) : BaseViewModel() {

    // LiveData for observing the list of ItemMySoundUI.
    private val _mySoundMutableLiveData: MutableLiveData<List<ItemMySoundUI>> = MutableLiveData()

    val mySoundLiveData: LiveData<List<ItemMySoundUI>>
        get() = _mySoundMutableLiveData

    /**
     * Returns a mutable copy of the current list of ItemMySoundUI.
     * @return A mutable copy of the LiveData list.
     * @author AnhTTH
     */
    private fun getValueMySound() = _mySoundMutableLiveData.toMutableListLiveData { it.copy() }

    /**
     * Fetches all sounds from the repository and updates the LiveData.
     * @param context The context for accessing resources.
     * @author AnhTTH
     */

    fun getAllMySound(context: Context) = viewModelScope.launch(
        Dispatchers.IO
    ) {
        mySoundRepo.getListMySounds(context).let { allDataImage ->
            val temp = allDataImage.toMutableList()
            temp.postValueDataMySound()
        }
    }

    /**
     * Updates the name of a sound identified by its ID.
     * @param name The new name of the sound.
     * @param id The ID of the sound to be updated.
     * @author AnhTTH
     */
    fun updateNameMySound(name: String, id: Long) = viewModelScope.launch(Dispatchers.IO) {
        getValueMySound()?.let { allMySound ->
            allMySound.firstOrNull {
                it.id == id
            }?.let {
                it.nameRingtone = name
                mySoundRepo.updateNameMySound(name, id)
            }
            _mySoundMutableLiveData.postValue(allMySound)
        }
    }

    /**
     * Processes a list of ItemMySoundUI objects and updates their duration.
     * The duration is formatted as "mm:ss".
     * @receiver The list of ItemMySoundUI to process.
     * @author AnhTTH
     */
    private fun List<ItemMySoundUI>.postValueDataMySound() {
        this.forEach {
            var minute = (it.durationLong) / (60 * 1000)
            var second = (it.durationLong - minute * 60 * 1000) / 1000
            val miliSecond = (it.durationLong - minute * 60 * 1000 - second * 1000)
            if (miliSecond > 500) second += 1
            if (second == 60L) {
                second = 0
                minute += 1L
            }
            it.duration = "${
                minute.toString().padStart(2, '0')
            }:${second.toString().padStart(2, '0')}"
        }
        _mySoundMutableLiveData.postValue(this)
    }

    /**
     * Deletes a sound identified by its file path and updates the LiveData.
     * @param path The file path of the sound to be deleted.
     * @author AnhTTH
     */
    fun deleteMySound(path: String) = viewModelScope.launch(Dispatchers.IO) {
        mySoundRepo.deleteMySound(path).let {
            getValueMySound()?.let { temp ->
                temp.firstOrNull { it.path == path }?.let {
                    temp.remove(it)
                    temp.toMutableList().postValueDataMySound()
                }
            }
        }
    }

}
