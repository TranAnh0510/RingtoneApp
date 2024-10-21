package com.example.appa.ui.activity.multilang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appa.common.Constant
import com.example.appa.data.local.shared.SharedPreferenceHelper
import com.example.appa.data.model.LanguageUI
import com.example.appa.data.repository.language.LanguageRepo
import com.example.appa.ui.base.BaseViewModel
import com.example.appa.ui.base.toMutableListLiveData
import com.example.appa.util.setAvatar
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel class for managing multiple languages.
 * @property languageRepository The repository for language-related operations.
 * @constructor Creates an instance of [MultiLangVM] with the provided [languageRepository].
 * @author AnhTTH
 */
@HiltViewModel
class MultiLangVM @Inject constructor(
    private val languageRepository: LanguageRepo,
) : BaseViewModel() {

    private val _languageLiveData: MutableLiveData<List<LanguageUI>> = MutableLiveData()

    /**
     * allow other application component to track changes to the languageLiveData
     * @author AnhTTH
     */
    val languageLiveData: LiveData<List<LanguageUI>>
        get() = _languageLiveData

    /**
     * get list language from repository
     * @author AnhTTH
     */
    fun getListLanguage() = viewModelScope.launch(Dispatchers.IO) {
        languageRepository.getAllLanguage().let { allLanguage ->

            //if list language is empty, insert default language to database
            if (allLanguage.isEmpty()) {
                val listLanguageDefault = mutableListOf<LanguageUI>()
                val language1 = LanguageUI(
                    name = "English",
                    code = "en",
                )
                val language2 = LanguageUI(
                    name = "Spanish",
                    code = "es",
                )
                val language3 = LanguageUI(
                    name = "French",
                    code = "fr",
                )

                val language4 = LanguageUI(
                    name = "Hindi",
                    code = "hi",
                )

                val language5 = LanguageUI(
                    name = "Portuguese",
                    code = "pt",
                )

                insertLanguageToDB(language1)
                insertLanguageToDB(language2)
                insertLanguageToDB(language3)
                insertLanguageToDB(language4)
                insertLanguageToDB(language5)

                listLanguageDefault.add(language1)
                listLanguageDefault.add(language2)
                listLanguageDefault.add(language3)
                listLanguageDefault.add(language4)
                listLanguageDefault.add(language5)
                listLanguageDefault.postValueLanguage()
            } else {
                //if list language is not empty, set the value of _languageLiveData with the list from repository
                //via postValueLanguage
                allLanguage.toMutableList().postValueLanguage()
            }
        }


    }

    /**
     * insert language to database via languageRepository
     * @author AnhTTH
     */
    private fun insertLanguageToDB(languageUI: LanguageUI) = viewModelScope.launch(Dispatchers.IO) {
        val idLang = languageRepository.insertLanguageToDb(languageUI)
        languageUI.id = idLang.toInt()
    }

    /**
     * store a saveFirstKeyIntro value to SharedPreference
     * @author AnhTTH
     */
    fun saveFirstKeyIntro() = viewModelScope.launch(Dispatchers.IO) {
        SharedPreferenceHelper.storeInt(
            Constant.KEY_FIRST_SHOW_INTRO, Constant.TYPE_SHOW_INTRO_ACT
        )
    }

    /**
     * update and sort list language
     * @author AnhTTH
     */

    private fun MutableList<LanguageUI>.postValueLanguage() {
        this.forEach {
            it.avatar = (it.code ?: "vi").setAvatar()
        }
        this.sortBy { it.name }
        _languageLiveData.postValue(this)
    }
}