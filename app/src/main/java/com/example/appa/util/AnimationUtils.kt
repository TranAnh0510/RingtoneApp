package com.example.appa.util

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.view.View
import com.example.appa.util.extension.gone
import com.example.appa.util.extension.visible

/**
 * Shows the view with animation.
 * @author AnhTTH
 */
fun View.showWithAnimation() {
    // Must be visible before setting animation to have effect
    visible()
    animate().translationY(0f).alpha(1.0f).setDuration(500)
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                clearAnimation()
                visible()
            }

        })
}

/**
 * Hides the view with animation.
 * @author AnhTTH
 */
fun View.hideWithAnimation() {
    animate().translationY(height.toFloat()).alpha(0.0f).setDuration(300)
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                clearAnimation()
                gone()
            }
        })
}