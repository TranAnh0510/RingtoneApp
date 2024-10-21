package com.example.appa.ui.base

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
    }

}

/**
 * convert data from MutableLiveData to MutableList.
 * @author AnhTTH
 */
fun <T> MutableLiveData<List<T>>.toMutableListLiveData(transform: (T) -> T): MutableList<T>? {
    return this.value?.map { transform(it) }?.toMutableList()
}

/**
 * observe data with exception handling in case an error occurs in the observe function.
 * @author AnhTTH
 */
fun <T> LiveData<T>.observeWithCatch(owner: LifecycleOwner, observer: (T) -> Unit) {
    this.observe(owner) { value ->
        value?.let {
            kotlin.runCatching {
                observer.invoke(it)
            }.onFailure { it.printStackTrace() }
        }
    }
}