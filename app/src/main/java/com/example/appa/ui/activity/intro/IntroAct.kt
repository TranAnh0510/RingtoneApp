package com.example.appa.ui.activity.intro

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.data.local.shared.SharedPreferenceHelper
import com.example.appa.databinding.ActivityIntroBinding
import com.example.appa.ui.activity.main.MainActivity
import com.example.appa.ui.activity.permission.PermissionAct
import com.example.appa.ui.adapter.viewpager.IntroAdapter
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.util.extension.checkSystemWritePermission
import com.example.appa.util.extension.isAtLeastSdkVersion
import com.example.appa.util.extension.isGrantMediaAudioPermission
import com.example.appa.util.extension.isGrantMediaVideoPermission
import com.example.appa.util.extension.isGrantReadExternalStoragePermission
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Activity for displaying the introductory screens.
 */
class IntroAct : BaseBindingActivity<ActivityIntroBinding, IntroVM>() {
    // Lazy initialization of the intro adapter
    private val introAdapter: IntroAdapter by lazy { IntroAdapter() }

    /**
     * Specifies the layout resource ID for this activity.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_intro

    /**
     * Returns the class type of the ViewModel.
     * @return The [IntroVM] class type.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<IntroVM> {
        return IntroVM::class.java
    }

    /**
     * Sets up the view components of the activity.
     * @param savedInstanceState The saved instance state bundle.
     * @author AnhTTH
     */
    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setupViewPager()
        initAction()
    }

    /**
     * Initializes actions for the view components.
     * @author AnhTTH
     */
    private fun initAction() {
        binding.tvNext.setOnSafeClick {
            kotlin.runCatching {
                viewModel.introMutableLiveData.value?.size?.let { size ->
                    with(binding.viewPager.currentItem) {
                        if (this < size - 1) {
                            binding.viewPager.currentItem = this + 1

                        } else if (this == size - 1) {
                            lifecycleScope.launch(Dispatchers.IO) {
                                SharedPreferenceHelper.storeInt(Constant.KEY_FIRST_SHOW_INTRO, 0)
                            }
                            val intent = if (isAtLeastSdkVersion(33)) {
                                if (checkSystemWritePermission() && isGrantMediaVideoPermission() && isGrantMediaAudioPermission()) {
                                    MainActivity::class.java
                                } else {
                                    PermissionAct::class.java
                                }
                            } else {
                                if (checkSystemWritePermission() && isGrantReadExternalStoragePermission()) {
                                    MainActivity::class.java
                                } else {
                                    PermissionAct::class.java
                                }
                            }

                            startActivity(Intent(this@IntroAct, intent))
                            finish()
                        }
                    }
                }
            }.onFailure { it.printStackTrace() }
        }
    }

    /**
     * Sets up the ViewPager for displaying intro screens.
     * @author AnhTTH
     */
    private fun setupViewPager() {
        kotlin.runCatching {
            binding.viewPager.adapter = introAdapter
            binding.viewPager.registerOnPageChangeCallback(object :
                ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    if (position == introAdapter.currentList.size - 1) {
                        binding.tvNext.text = getString(R.string.get_start)
                    } else {
                        binding.tvNext.text = getString(R.string.next)
                    }
                }

            })
            binding.dotsIndicator.attachTo(binding.viewPager)
        }.onFailure { it.printStackTrace() }
    }

    /**
     * Sets up data for the ViewModel.
     * @author AnhTTH
     */
    override fun setupData() {
        viewModel.getIntro(this)
        viewModel.introMutableLiveData.observeWithCatch(this) {
            introAdapter.submitList(it.toMutableList())
        }

    }
}