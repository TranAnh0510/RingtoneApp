package com.example.appa.rate;

import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

/**
 * An interface defining methods for a simple rating bar.
 * @author AnhTTH
 */
interface SimpleRatingBar {
    /**
     * Sets the rating value for the rating bar.
     *
     * @param rating The rating value to be set.
     * @author AnhTTH
     */
    void setRating(float rating);

    /**
     * Gets the current rating value of the rating bar.
     *
     * @return The current rating value.
     * @author AnhTTH
     */
    float getRating();

    /**
     * Sets the drawable to be used for empty rating stars.
     *
     * @param drawable The drawable for empty stars.
     * @author AnhTTH
     */
    void setEmptyDrawable(@NonNull Drawable drawable);

    /**
     * Sets the drawable to be used for filled rating stars.
     *
     * @param drawable The drawable for filled stars.
     * @author AnhTTH
     */
    void setFilledDrawable(@NonNull Drawable drawable);

    /**
     * Checks if the rating bar is in indicator mode.
     *
     * @return True if the rating bar is in indicator mode, false otherwise.
     * @author AnhTTH
     */

    boolean isIndicator();

    /**
     * Checks if the rating bar is scrollable.
     *
     * @return True if the rating bar is scrollable, false otherwise.
     * @author AnhTTH
     */
    boolean isScrollable();

    /**
     * Checks if the rating bar is clickable.
     *
     * @return True if the rating bar is clickable, false otherwise.
     * @author AnhTTH
     */

    boolean isClickable();

    /**
     * Checks if the clear rating functionality is enabled for the rating bar.
     *
     * @return True if clear rating is enabled, false otherwise.
     * @author AnhTTH
     */
    boolean isClearRatingEnabled();


}
