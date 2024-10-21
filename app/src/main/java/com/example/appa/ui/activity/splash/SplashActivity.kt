package com.example.appa.ui.activity.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import com.example.appa.R
import com.example.appa.common.Constant
import com.example.appa.databinding.ActivitySplashBinding
import com.example.appa.ui.activity.intro.IntroAct
import com.example.appa.ui.activity.multilang.MultiLangAct
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.ui.base.observeWithCatch
import com.example.appa.util.extension.setFullScreen

/**
 * It sets up the view and data for the splash screen,
 * manages animations, and directs to the appropriate next screen.
 * @author AnhTTH
 */
class SplashActivity : BaseBindingActivity<ActivitySplashBinding, SplashVM>() {

    /**
     * Specifies the layout resource ID for the splash screen.
     * @author AnhTTH
     */
    override val layoutId: Int
        get() = R.layout.activity_splash

    /**
     * Returns the ViewModel class associated with this activity.
     * @return The SplashVM class.
     * @author AnhTTH
     */
    override fun getViewModel(): Class<SplashVM> {
        return SplashVM::class.java
    }

    /**
     * Sets up the view for the splash screen.
     * This method sets the screen to full screen mode and initializes the animation listener for the logo.
     * @param savedInstanceState The saved instance state bundle.
     * @author AnhTTH
     */

    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        binding.lottieLogo.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {}

            override fun onAnimationEnd(animation: Animator) {

                openMainActivity()
            }

            override fun onAnimationCancel(animation: Animator) {}

            override fun onAnimationRepeat(animation: Animator) {}
        })
        binding.lottieLogo.playAnimation()

    }

    /**
     * Sets up the data for the splash screen.
     * Observes the ViewModel for the next screen type
     * and navigates to the appropriate activity based on the type.
     * @author AnhTTH
     */

    override fun setupData() {
        viewModel.typeNextScreen.observeWithCatch(this) { type ->
            with(type) {
                when (this) {
                    Constant.TYPE_SHOW_INTRO_ACT -> {
                        startIntroAct()
                    }

                    Constant.TYPE_SHOW_LANGUAGE_ACT -> {
                        startMultiLangAct()
                    }

                    else -> {
                        startIntroAct()
                    }
                }
                finish()
            }
        }

    }

    private fun startIntroAct() {
        startActivity(Intent(this@SplashActivity, IntroAct::class.java))

    }

    /**
     * Starts the MultiLangAct activity with the appropriate extras.
     * @author AnhTTH
     */
    private fun startMultiLangAct() {
        Intent(this@SplashActivity, MultiLangAct::class.java).apply {
            putExtra(Constant.TYPE_LANG, Constant.TYPE_LANGUAGE_SPLASH)
            startActivity(this)
        }

    }

    /**
     * Opens the main activity by invoking the ViewModel's method to get the next screen type.
     * @author AnhTTH
     */
    private fun openMainActivity() {
        viewModel.getTypeNextScreen()
    }
}