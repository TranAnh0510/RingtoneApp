package com.example.appa.rate;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.appa.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A custom rating bar widget that extends LinearLayout and implements SimpleRatingBar interface.
 *
 * @author AnhTTH
 */
public class BaseRatingBar extends LinearLayout implements SimpleRatingBar {
    /**
     * Interface definition for a callback to be invoked when the rating changes.
     *
     * @author AnhTTH
     */
    public interface OnRatingChangeListener {
        /**
         * Called when the rating changes.
         *
         * @param ratingBar The BaseRatingBar whose rating has changed.
         * @param rating    The new rating value.
         * @param fromUser  True if the rating change was initiated by user touch, false otherwise.
         * @author AnhTTH
         */
        void onRatingChange(BaseRatingBar ratingBar, float rating, boolean fromUser);
    }

    public static final String TAG = "SimpleRatingBar";

    private int mNumStars;
    private int mPadding = 20;
    private int mStarWidth;
    private int mStarHeight;
    private float mMinimumStars = 0;
    private float mRating = -1;
    private float mStepSize = 1f;
    private float mPreviousRating = 0;

    private boolean mIsIndicator = false;
    private boolean mIsScrollable = true;
    private boolean mIsClickable = true;
    private boolean mClearRatingEnabled = true;

    private float mStartX;
    private float mStartY;

    private Drawable mEmptyDrawable;
    private Drawable mFilledDrawable;

    private OnRatingChangeListener mOnRatingChangeListener;

    protected List<PartialView> mPartialViews;

    public BaseRatingBar(Context context) {
        this(context, null);
    }

    /* Call by xml layout */
    public BaseRatingBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /**
     * @param context      context
     * @param attrs        attributes from XML => app:mainText="mainText"
     * @param defStyleAttr attributes from default style (Application theme or activity theme)
     * @author AnhTTH
     */
    public BaseRatingBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.BaseRatingBar);
        final float rating = typedArray.getFloat(R.styleable.BaseRatingBar_srb_rating, 0);

        initParamsValue(typedArray, context);
        verifyParamsValue();
        initRatingView();
        setRating(rating);
    }

    /**
     * Initializes parameters value based on the attributes defined in the XML layout.
     *
     * @param typedArray The TypedArray containing attribute values.
     * @param context    The context of the view.
     */
    private void initParamsValue(TypedArray typedArray, Context context) {
        mNumStars = typedArray.getInt(R.styleable.BaseRatingBar_srb_numStars, mNumStars);
        mStepSize = typedArray.getFloat(R.styleable.BaseRatingBar_srb_stepSize, mStepSize);
        mMinimumStars = typedArray.getFloat(R.styleable.BaseRatingBar_srb_minimumStars, mMinimumStars);
        mPadding = typedArray.getDimensionPixelSize(R.styleable.BaseRatingBar_srb_starPadding, mPadding);
        mStarWidth = typedArray.getDimensionPixelSize(R.styleable.BaseRatingBar_srb_starWidth, 0);
        mStarHeight = typedArray.getDimensionPixelSize(R.styleable.BaseRatingBar_srb_starHeight, 0);
        mEmptyDrawable = typedArray.hasValue(R.styleable.BaseRatingBar_srb_drawableEmpty) ? ContextCompat.getDrawable(context, typedArray.getResourceId(R.styleable.BaseRatingBar_srb_drawableEmpty, View.NO_ID)) : null;
        mFilledDrawable = typedArray.hasValue(R.styleable.BaseRatingBar_srb_drawableFilled) ? ContextCompat.getDrawable(context, typedArray.getResourceId(R.styleable.BaseRatingBar_srb_drawableFilled, View.NO_ID)) : null;
        mIsIndicator = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_isIndicator, mIsIndicator);
        mIsScrollable = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_scrollable, mIsScrollable);
        mIsClickable = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_clickable, mIsClickable);
        mClearRatingEnabled = typedArray.getBoolean(R.styleable.BaseRatingBar_srb_clearRatingEnabled, mClearRatingEnabled);
        typedArray.recycle();
    }

    /**
     * Verifies and adjusts the values of parameters to ensure they meet certain criteria.
     * @author AnhTTH
     */
    private void verifyParamsValue() {
        if (mNumStars <= 0) {
            mNumStars = 5;
        }

        if (mPadding < 0) {
            mPadding = 0;
        }

        if (mEmptyDrawable == null) {
            mEmptyDrawable = ContextCompat.getDrawable(getContext(), R.drawable.empty);
        }

        if (mFilledDrawable == null) {
            mFilledDrawable = ContextCompat.getDrawable(getContext(), R.drawable.filled);
        }

        if (mStepSize > 1.0f) {
            mStepSize = 1.0f;
        } else if (mStepSize < 0.1f) {
            mStepSize = 0.1f;
        }

        mMinimumStars = RatingBarUtils.getValidMinimumStars(mMinimumStars, mNumStars, mStepSize);
    }

    /**
     * Initializes the rating view by creating and adding partial views for each star.
     * @author AnhTTH
     */
    private void initRatingView() {
        mPartialViews = new ArrayList<>();

        for (int i = 1; i <= mNumStars; i++) {
            PartialView partialView = getPartialView(i, mStarWidth, mStarHeight, mPadding, mFilledDrawable, mEmptyDrawable);
            addView(partialView);

            mPartialViews.add(partialView);
        }
    }

    private PartialView getPartialView(final int partialViewId, int starWidth, int starHeight, int padding, Drawable filledDrawable, Drawable emptyDrawable) {
        PartialView partialView = new PartialView(getContext(), partialViewId, starWidth, starHeight, padding);
        partialView.setFilledDrawable(filledDrawable);
        partialView.setEmptyDrawable(emptyDrawable);
        return partialView;
    }

    /**
     * Use {maxIntOfRating} because if the rating is 3.5
     * the view which id is 3 also need to be filled.
     * @author AnhTTH
     */
    protected void fillRatingBar(final float rating) {
        for (PartialView partialView : mPartialViews) {
            int ratingViewId = (int) partialView.getTag();
            double maxIntOfRating = Math.ceil(rating);

            if (ratingViewId > maxIntOfRating) {
                partialView.setEmpty();
                continue;
            }

            if (ratingViewId == maxIntOfRating) {
                partialView.setPartialFilled(rating);
            } else {
                partialView.setFilled();
            }
        }
    }

    @Override
    public void setRating(float rating) {
        setRating(rating, false);
    }

    /**
     * Sets the rating value for this RatingBar.
     *
     * @param rating   The rating value to be set.
     * @param fromUser True if the rating change is initiated by the user, false otherwise.
     */
    private void setRating(float rating, boolean fromUser) {
        if (rating > mNumStars) {
            rating = mNumStars;
        }

        if (rating < mMinimumStars) {
            rating = mMinimumStars;
        }

        if (mRating == rating) {
            return;
        }

        // Respect Step size. So if the defined step size is 0.5, and we're attributing it a 4.7 rating,
        // it should actually be set to `4.5` rating.
        float stepAbidingRating = Double.valueOf(Math.floor(rating / mStepSize)).floatValue() * mStepSize;

        mRating = stepAbidingRating;

        if (mOnRatingChangeListener != null) {
            mOnRatingChangeListener.onRatingChange(this, mRating, fromUser);
        }

        fillRatingBar(mRating);
    }

    /**
     * Gets the current rating value of this RatingBar.
     *
     * @return The current rating value.
     */
    @Override
    public float getRating() {
        return mRating;
    }


    /**
     * Sets the empty drawable for this RatingBar.
     *
     * @param drawable The drawable to be used as the empty drawable.
     * @throws NullPointerException if the provided drawable is null.
     */
    @Override
    public void setEmptyDrawable(@NonNull Drawable drawable) {
        mEmptyDrawable = drawable;
        for (PartialView partialView : mPartialViews) {
            partialView.setEmptyDrawable(drawable);
        }
    }

    /**
     * Sets the filled drawable for this RatingBar.
     *
     * @param drawable The drawable to be used as the filled drawable.
     * @throws NullPointerException if the provided drawable is null.
     */
    @Override
    public void setFilledDrawable(@NonNull Drawable drawable) {
        mFilledDrawable = drawable;
        for (PartialView partialView : mPartialViews) {
            partialView.setFilledDrawable(drawable);
        }
    }

    /**
     * Indicates whether this RatingBar is in indicator mode.
     *
     * @return True if this RatingBar is in indicator mode, false otherwise.
     */
    @Override
    public boolean isIndicator() {
        return mIsIndicator;
    }


    /**
     * Indicates whether this RatingBar is scrollable.
     *
     * @return True if this RatingBar is scrollable, false otherwise.
     */
    @Override
    public boolean isScrollable() {
        return mIsScrollable;
    }

    /**
     * Indicates whether this RatingBar is clickable.
     *
     * @return True if this RatingBar is clickable, false otherwise.
     * @author AnhTTH
     */
    @Override
    public boolean isClickable() {
        return mIsClickable;
    }

    /**
     * Sets whether this RatingBar is clickable.
     *
     * @param clickable True to make this RatingBar clickable, false otherwise.
     * @author AnhTTH
     */
    @Override
    public void setClickable(boolean clickable) {
        this.mIsClickable = clickable;
    }


    /**
     * Indicates whether the clear rating feature is enabled.
     *
     * @return True if the clear rating feature is enabled, false otherwise.
     * @author AnhTTH
     */
    @Override
    public boolean isClearRatingEnabled() {
        return mClearRatingEnabled;
    }


    /**
     * Called when a touch event is intercepted by this RatingBar.
     *
     * @param ev The motion event being intercepted.
     * @return True if the touch event should be intercepted, false otherwise.
     * @author AnhTTH
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    /**
     * Handles touch events for this RatingBar.
     *
     * @param event The motion event being processed.
     * @return True if the touch event is handled, false otherwise.
     * @author AnhTTH
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (isIndicator()) {
            return false;
        }

        float eventX = event.getX();
        float eventY = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mStartX = eventX;
                mStartY = eventY;
                mPreviousRating = mRating;
                break;
            case MotionEvent.ACTION_MOVE:
                if (!isScrollable()) {
                    return false;
                }

                handleMoveEvent(eventX);
                break;
            case MotionEvent.ACTION_UP:
                if (!RatingBarUtils.isClickEvent(mStartX, mStartY, event) || !isClickable()) {
                    return false;
                }

                handleClickEvent(eventX);
        }

        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    /**
     * Handles the move event during touch interaction with this RatingBar.
     *
     * @param eventX The x-coordinate of the move event.
     * @author AnhTTH
     */
    private void handleMoveEvent(float eventX) {
        for (PartialView partialView : mPartialViews) {
            if (eventX < partialView.getWidth() / 10f + (mMinimumStars * partialView.getWidth())) {
                setRating(mMinimumStars, true);
                return;
            }

            if (!isPositionInRatingView(eventX, partialView)) {
                continue;
            }

            float rating = RatingBarUtils.calculateRating(partialView, mStepSize, eventX);

            if (mRating != rating) {
                setRating(rating, true);
            }
        }
    }

    /**
     * Handles click events on the rating bar by determining the clicked position and updating the rating accordingly.
     *
     * @param eventX The x-coordinate of the click event.
     * @author AnhTTH
     */
    private void handleClickEvent(float eventX) {
        for (PartialView partialView : mPartialViews) {
            if (!isPositionInRatingView(eventX, partialView)) {
                continue;
            }

            float rating = mStepSize == 1 ? (int) partialView.getTag() : RatingBarUtils.calculateRating(partialView, mStepSize, eventX);

            if (mPreviousRating == rating && isClearRatingEnabled()) {
                setRating(mMinimumStars, true);
            } else {
                setRating(rating, true);
            }
            break;
        }
    }

    /**
     * Checks if the given position falls within the bounds of the rating view.
     *
     * @param eventX     The x-coordinate of the position to check.
     * @param ratingView The rating view to check against.
     * @return True if the position is within the rating view, false otherwise.
     * @author AnhTTH
     */
    private boolean isPositionInRatingView(float eventX, View ratingView) {
        return eventX > ratingView.getLeft() && eventX < ratingView.getRight();
    }

    /**
     * Sets a listener to be notified when the rating changes.
     *
     * @param onRatingChangeListener The listener to be set.
     * @author AnhTTH
     */
    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        mOnRatingChangeListener = onRatingChangeListener;
    }

    /**
     * Called to retrieve the instance state of this RatingBar when it is being removed from its activity's view hierarchy.
     *
     * @return A Parcelable object containing the current dynamic state of this RatingBar instance.
     * @see Parcelable
     * @author AnhTTH
     */
    @Override
    protected Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        SavedState ss = new SavedState(superState);

        ss.setRating(mRating);
        return ss;
    }

    /**
     * Called to restore the instance state of this RatingBar from a previously saved state.
     *
     * @param state The Parcelable object containing the saved state of this RatingBar.
     * @see Parcelable
     * @author AnhTTH
     */
    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());

        setRating(ss.getRating());
    }
}