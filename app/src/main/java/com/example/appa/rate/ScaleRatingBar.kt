package com.example.appa.rate

import android.content.Context
import android.util.AttributeSet
import android.view.animation.AnimationUtils
import com.example.appa.R
import kotlin.math.ceil
/**
 * A subclass of AnimationRatingBar that provides additional animation effects when filling or emptying the RatingBar.
 * This class implements the ScaleRatingBar which scales the rating views when filling or emptying.
 * @constructor Creates a ScaleRatingBar instance.
 * @param context The context in which the ScaleRatingBar is constructed.
 * @param attrs The attribute set used to initialize the ScaleRatingBar.
 * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource to apply to this view.
 * @author AnhTTH
 */
class ScaleRatingBar : AnimationRatingBar {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    /**
     * Empties the RatingBar by setting all partial views to empty state with animation.
     * @author AnhTTH
     */
    fun emptyRatingBar() {
        // Need to remove all previous runnable to prevent emptyRatingBar and fillRatingBar out of sync
        if (mRunnable != null) {
            mHandler!!.removeCallbacksAndMessages(mRunnableToken)
        }
        var delay: Long = 0
        for (view in mPartialViews) {
            mHandler!!.postDelayed({ view.setEmpty() }, 5.let { delay += it; delay })
        }
    }
    /**
     * Fills the RatingBar to the given rating value with animation.
     * @param rating The rating value to fill the RatingBar.
     * @author AnhTTH
     */
    override fun fillRatingBar(rating: Float) {
        // Need to remove all previous runnable to prevent emptyRatingBar and fillRatingBar out of sync
        if (mRunnable != null) {
            mHandler!!.removeCallbacksAndMessages(mRunnableToken)
        }
        for (partialView in mPartialViews) {
            val ratingViewId = partialView.tag as Int
            val maxIntOfRating = ceil(rating.toDouble())
            if (ratingViewId > maxIntOfRating) {
                partialView.setEmpty()
                continue
            }
            mRunnable = getAnimationRunnable(rating, partialView, ratingViewId, maxIntOfRating)
            postRunnable(mRunnable, ANIMATION_DELAY)
        }
    }
    /**
     * Creates a Runnable object for animating the filling of a partial view.
     * @param rating The rating value to fill the RatingBar.
     * @param partialView The partial view to be animated.
     * @param ratingViewId The ID of the rating view.
     * @param maxIntOfRating The maximum integer value of the rating.
     * @return The created Runnable object.
     * @author AnhTTH
     */
    private fun getAnimationRunnable(
        rating: Float,
        partialView: PartialView,
        ratingViewId: Int,
        maxIntOfRating: Double
    ): Runnable {
        return Runnable {
            if (ratingViewId.toDouble() == maxIntOfRating) {
                partialView.setPartialFilled(rating)
            } else {
                partialView.setFilled()
            }
            if (ratingViewId.toFloat() == rating) {
                val scaleUp = AnimationUtils.loadAnimation(context, R.anim.scale_up)
                val scaleDown = AnimationUtils.loadAnimation(context, R.anim.scale_down)
                partialView.startAnimation(scaleUp)
                partialView.startAnimation(scaleDown)
            }
        }
    }

    companion object {
        private const val ANIMATION_DELAY: Long = 15
    }
}