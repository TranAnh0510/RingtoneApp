package com.example.appa.ui.activity.intro

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.R
import com.example.appa.data.model.IntroUI
import com.example.appa.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * ViewModel for managing the data of the intro screens.
 * @author AnhTTH
 */
class IntroVM : BaseViewModel() {
    // MutableLiveData for holding the list of IntroUI items
    private val _introMutableLiveData: MutableLiveData<List<IntroUI>> = MutableLiveData()

    /**
     * LiveData for observing the list of IntroUI items.
     * @author AnhTTH
     */
    val introMutableLiveData: LiveData<List<IntroUI>>
        get() = _introMutableLiveData

    /**
     * Retrieves the introductory data and updates the LiveData.
     * @param context The application context used to access resources.
     * @author AnhTTH
     */
    fun getIntro(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            val listIntroEntity = mutableListOf<IntroUI>()
            val titlesResourceIds = listOf(
                R.string.title_intro_1, R.string.title_intro_2, R.string.title_intro_3

            )

            val contentsResourceIds = listOf(
                R.string.content_intro_1, R.string.content_intro_2, R.string.content_intro_3
            )

            val drawableResourceIds = listOf(
                R.drawable.img_intro_1,
                R.drawable.img_intro_2,
                R.drawable.img_intro_3,
            )

            for (i in titlesResourceIds.indices) {
                listIntroEntity.add(
                    IntroUI(
                        context.getString(titlesResourceIds[i]),
                        context.getString(contentsResourceIds[i]),
                        drawableResourceIds[i]
                    )
                )
            }
            _introMutableLiveData.postValue(listIntroEntity)

        }
    }
}