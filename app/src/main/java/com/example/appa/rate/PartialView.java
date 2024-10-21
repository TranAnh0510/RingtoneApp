package com.example.appa.rate;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
/**
 * Custom view representing a partial rating in a rating bar.
 * @author AnhTTH
 */
class PartialView
        extends RelativeLayout {

    private ImageView mFilledView;
    private ImageView mEmptyView;
    private int mStarWidth = 0;
    private int mStarHeight = 0;
    /**
     * Constructs a new instance of PartialView.
     * @param context The context.
     * @param partialViewId The ID of the partial view.
     * @param starWidth The width of the star.
     * @param startHeight The height of the star.
     * @param padding The padding around the view.
     * @author AnhTTH
     */
    public PartialView(Context context, int partialViewId, int starWidth, int startHeight,
                       int padding) {
        super(context);

        mStarWidth = starWidth;
        mStarHeight = startHeight;

        setTag(partialViewId);
        setPadding(padding, padding, padding, padding);
        init();
    }
    /**
     * Constructs a new instance of PartialView.
     *
     * @param context The context.
     * @param attrs   The attribute set.
     * @author AnhTTH
     */
    public PartialView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    /**
     * Constructs a new instance of PartialView.
     *
     * @param context      The context.
     * @param attrs        The attribute set.
     * @param defStyleAttr The default style attribute.
     * @author AnhTTH
     */
    public PartialView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    /**
     * Initializes the PartialView by setting up the layout and views.
     * @author AnhTTH
     */
    private void init() {
        // Make PartialViews use the space when the RatingBar has more width (e.g. match_parent)
        setLayoutParams(new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
                1f));

        LayoutParams params = new LayoutParams(
                mStarWidth == 0 ? LayoutParams.WRAP_CONTENT : mStarWidth,
                mStarHeight == 0 ? LayoutParams.WRAP_CONTENT : mStarHeight);
        params.addRule(CENTER_IN_PARENT);

        mFilledView = new ImageView(getContext());
        mFilledView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(mFilledView, params);

        mEmptyView = new ImageView(getContext());
        mEmptyView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(mEmptyView, params);

        setEmpty();
    }
    /**
     * Sets the drawable for the filled part of the partial view.
     *
     * @param drawable The drawable to set.
     * @author AnhTTH
     */
    public void setFilledDrawable(@NonNull Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }

        ClipDrawable clipDrawable =
                new ClipDrawable(drawable.getConstantState().newDrawable(), Gravity.START,
                                 ClipDrawable.HORIZONTAL);
        mFilledView.setImageDrawable(clipDrawable);
    }
    /**
     * Sets the drawable for the empty part of the partial view.
     * @param drawable The drawable to set.
     * @author AnhTTH
     */
    public void setEmptyDrawable(@NonNull Drawable drawable) {
        if (drawable.getConstantState() == null) {
            return;
        }

        ClipDrawable clipDrawable =
                new ClipDrawable(drawable.getConstantState().newDrawable(), Gravity.END,
                                 ClipDrawable.HORIZONTAL);
        mEmptyView.setImageDrawable(clipDrawable);
    }

    public void setFilled() {
        mFilledView.setImageLevel(10000);
        mEmptyView.setImageLevel(0);
    }

    public void setPartialFilled(float rating) {
        float percentage = rating % 1;
        int level = (int) (10000 * percentage);
        level = level == 0 ? 10000 : level;
        mFilledView.setImageLevel(level);
        mEmptyView.setImageLevel(10000 - level);
    }

    public void setEmpty() {
        mFilledView.setImageLevel(0);
        mEmptyView.setImageLevel(10000);
    }

    public void setStarWidth(@IntRange(from = 0) int starWidth) {
        mStarWidth = starWidth;

        ViewGroup.LayoutParams params = mFilledView.getLayoutParams();
        params.width = mStarWidth;
        mFilledView.setLayoutParams(params);
        mEmptyView.setLayoutParams(params);
    }

    public void setStarHeight(@IntRange(from = 0) int starHeight) {
        mStarHeight = starHeight;

        ViewGroup.LayoutParams params = mFilledView.getLayoutParams();
        params.height = mStarHeight;
        mFilledView.setLayoutParams(params);
        mEmptyView.setLayoutParams(params);
    }
}
