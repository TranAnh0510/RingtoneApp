package com.example.appa.rate

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.os.SystemClock
import android.util.AttributeSet
import java.util.UUID

/**
 * A custom RatingBar that supports animation.
 * This class extends BaseRatingBar.
 * @author AnhTTH
 */
open class AnimationRatingBar : BaseRatingBar {
    /** The handler used for posting delayed runnables. */
    protected var mHandler: Handler? = null

    /** The runnable for handling animation tasks. */
    protected var mRunnable: Runnable? = null

    /** Unique identifier for the runnable. */
    protected var mRunnableToken = UUID.randomUUID().toString()

    /**
     * Constructor for creating an AnimationRatingBar.
     * @param context The context in which the AnimationRatingBar will be used.
     * @author AnhTTH
     */
    protected constructor(context: Context?) : super(context) {
        init()
    }

    /**
     * Constructor for creating an AnimationRatingBar.
     * @param context The context in which the AnimationRatingBar will be used.
     * @param attrs The attribute set defining the AnimationRatingBar's attributes.
     * @author AnhTTH
     */
    protected constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    /**
     * Constructor for creating an AnimationRatingBar.
     * @param context The context in which the AnimationRatingBar will be used.
     * @param attrs The attribute set defining the AnimationRatingBar's attributes.
     * @param defStyleAttr An attribute in the current theme that contains a reference to a style resource.
     * @author AnhTTH
     */
    protected constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs, defStyleAttr
    ) {
        init()
    }

    /**
     * Initializes the AnimationRatingBar.
     * @author AnhTTH
     */
    private fun init() {
        mHandler = Handler(Looper.getMainLooper())
    }

    /**
     * Posts a runnable to the handler with a specified delay.
     * @param runnable The runnable to be executed.
     * @param ANIMATION_DELAY The delay in milliseconds before the runnable is executed.
     * @author AnhTTH
     */
    protected fun postRunnable(runnable: Runnable?, ANIMATION_DELAY: Long) {
        if (mHandler == null) {
            mHandler = Handler(Looper.getMainLooper())
        }
        val timeMillis = SystemClock.uptimeMillis() + ANIMATION_DELAY
        mHandler?.postAtTime(runnable!!, mRunnableToken, timeMillis)
    }
}