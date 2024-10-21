package com.example.appa.rate;

import android.view.MotionEvent;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
/**
 * Utility class for rating bar functionality.
 * @author AnhTTH
 */
class RatingBarUtils {

    private static DecimalFormat mDecimalFormat;
    private static final int MAX_CLICK_DISTANCE = 5;
    private static final int MAX_CLICK_DURATION = 200;
    /**
     * Checks if the MotionEvent corresponds to a click event.
     * @param startX The x-coordinate of the starting point of the touch event.
     * @param startY The y-coordinate of the starting point of the touch event.
     * @param event The MotionEvent to be checked.
     * @return True if the event corresponds to a click event, false otherwise.
     * @author AnhTTH
     */
    static boolean isClickEvent(float startX, float startY, MotionEvent event) {
        float duration = event.getEventTime() - event.getDownTime();
        if (duration > MAX_CLICK_DURATION) {
            return false;
        }

        float differenceX = Math.abs(startX - event.getX());
        float differenceY = Math.abs(startY - event.getY());
        return !(differenceX > MAX_CLICK_DISTANCE || differenceY > MAX_CLICK_DISTANCE);
    }
    /**
     * Calculates the rating based on the touch event position.
     * @param partialView The PartialView representing the rating bar.
     * @param stepSize The size of each step in the rating scale.
     * @param eventX The x-coordinate of the touch event.
     * @return The calculated rating.
     * @author AnhTTH
     */
    static float calculateRating(PartialView partialView, float stepSize, float eventX) {
        DecimalFormat decimalFormat = RatingBarUtils.getDecimalFormat();
        float ratioOfView = Float.parseFloat(decimalFormat.format((eventX - partialView.getLeft()) / partialView.getWidth()));
        float steps = Math.round(ratioOfView / stepSize) * stepSize;
        return Float.parseFloat(decimalFormat.format((int) partialView.getTag() - (1 - steps)));
    }
    /**
     * Adjusts the minimum number of stars to be within a valid range.
     * @param minimumStars The minimum number of stars to be adjusted.
     * @param numStars The total number of stars in the rating bar.
     * @param stepSize The size of each step in the rating scale.
     * @return The adjusted minimum number of stars.
     * @author AnhTTH
     */
    static float getValidMinimumStars(float minimumStars, int numStars, float stepSize) {
        if (minimumStars < 0) {
            minimumStars = 0;
        }

        if (minimumStars > numStars) {
            minimumStars = numStars;
        }

        if (minimumStars % stepSize != 0) {
            minimumStars = stepSize;
        }
        return minimumStars;
    }
    /**
     * Gets the DecimalFormat instance used for formatting ratings.
     * @return The DecimalFormat instance.
     * @author AnhTTH
     */
    static DecimalFormat getDecimalFormat() {
        if (mDecimalFormat == null) {
            DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
            symbols.setDecimalSeparator('.');
            mDecimalFormat = new DecimalFormat("#.##", symbols);
        }
        return mDecimalFormat;
    }
}
