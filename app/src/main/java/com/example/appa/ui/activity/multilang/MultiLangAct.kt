package com.example.appa.ui.activity.multilang

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.common.Constant.TYPE_LANGUAGE_SETTING
import com.example.appa.common.Constant.TYPE_LANGUAGE_SPLASH
import com.example.appa.databinding.ActivityMultiLangBinding
import com.example.appa.ui.activity.intro.IntroAct
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.adapter.recyclerview.MultiLangAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.util.LanguageUtil.changeLang
import com.example.appa.util.LanguageUtil.getPreLanguage
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.invisible
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import com.example.appa.util.extension.visible
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Activity for managing multiple languages.
 * Extends [BaseBindingActivity] to utilize data binding and ViewModel.
 * @author AnhTTH
 */
class MultiLangAct : BaseBindingActivity<ActivityMultiLangBinding, MultiLangVM>() {

    // Type for language selection, default value is 0
    private var type: Int = 0

    // Current position of the selected language
    private var currentPosLanguage = 0

    // Old language code, default is "en" (English)
    private var oldCode = "en"

    // New selected language code
    private var code = ""

    // Adapter for managing the list of languages
    private val multiLangAdapter: MultiLangAdapter by lazy {
        MultiLangAdapter().apply {
            // Callback for item selection in the language list
            callBack = { pos, item ->
                code = item.code ?: code
                currentPosLanguage = pos
            }
            // Set the adapter for the RecyclerView
            binding.rcLang.adapter = this
        }
    }

    /**
     * Provides the layout resource ID for the activity.
     * @return The layout resource ID.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_multi_lang

    /**
     * Returns the ViewModel class for the activity.
     * @return The [Class] object representing the ViewModel class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<MultiLangVM> {
        return MultiLangVM::class.java
    }

    /**
     * display view intro on screen
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.tvTitleSplash, 8)
        setMarginStatusBar(binding.tvTileSetting, 8)
        intent?.let {
            type = it.getIntExtra(Constant.TYPE_LANG, 0)
            updateUIForType(type)
        }
        lifecycleScope.launch(Dispatchers.IO) {
            oldCode = this@MultiLangAct.getPreLanguage()
            code = oldCode
        }


    }

    /**
     * setup Data from repository and observe the changes in LanguageLiveData
     * when data change, updates the language list for the adapter
     * determine the current position of language selected
     * @author AnhTTH
     */
    override fun setupData() {
        viewModel.getListLanguage()
        viewModel.languageLiveData.observeWithCatch(this) { data ->
            multiLangAdapter.submitList(data)
            data.indexOfFirst { it.code == this.getPreLanguage() }.let { pos ->
                currentPosLanguage = pos
                multiLangAdapter.newPosition = pos
            }
        }

    }

    /** update UI for type
     * @author AnhTTH
     */
    private fun updateUIForType(type: Int) {
        when (type) {
            TYPE_LANGUAGE_SPLASH -> {
                binding.tvTileSetting.invisible()
                binding.imBack.gone()
                binding.tvTitleSplash.visible()
                binding.imChooseLang.visible()
                binding.imChooseLang.setOnSafeClick {
                    viewModel.saveFirstKeyIntro()
                    this.changeLang(code.ifEmpty { oldCode })
                    startActivity(Intent(this, IntroAct::class.java))
                    finish()

                }
            }

            TYPE_LANGUAGE_SETTING -> {
                binding.tvTileSetting.visible()
                binding.imBack.visible()
                binding.tvTitleSplash.invisible()
                binding.imChooseLang.gone()
                binding.imBack.setOnSafeClick {
                    if (oldCode != code) {
                        this.changeLang(code.ifEmpty { oldCode })
                        Intent(this, MainActivity::class.java).apply {
                            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                            startActivity(this)
                        }
                    }
                    finish()
                }
            }
        }
    }

}