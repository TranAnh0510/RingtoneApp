package com.example.appa.ui.activity.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.common.Constant
import com.example.appa.data.local.shared.SharedPreferenceHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * The SplashVM class extends BaseViewModel to manage data and logic related to the splash screen.
 * It uses LiveData to observe and update the type of the next screen to display.
 * @author AnhTTH
 */
class SplashVM : BaseViewModel() {

    private val _typeNextScreen: MutableLiveData<Int> = MutableLiveData()

    /**
     * Store state type next screen
     * Case 1: TYPE_SHOW_LANGUAGE_ACT
     * Case 2: TYPE_SHOW_INTRO_ACT
     * @author AnhTTH
     */
    val typeNextScreen: LiveData<Int>
        get() = _typeNextScreen

    fun getTypeNextScreen() = viewModelScope.launch(Dispatchers.IO) {
         // post value from livedata to share preference to save
        _typeNextScreen.postValue(
            //get value from share preference
            SharedPreferenceHelper.getInt(
                Constant.KEY_FIRST_SHOW_INTRO,
                Constant.TYPE_SHOW_LANGUAGE_ACT
            )
        )
    }

}