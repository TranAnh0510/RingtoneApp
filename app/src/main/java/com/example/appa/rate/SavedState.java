package com.example.appa.rate;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/**
 * A Parcelable implementation used to save and restore the state of the RatingBar.
 * @author AnhTTH
 */
class SavedState extends View.BaseSavedState {

    private float rating;
    /**
     * Constructor to create a new SavedState instance.
     *
     * @param superState The Parcelable state of the superclass.
     * @author AnhTTH
     */
    SavedState(Parcelable superState) {
        super(superState);
    }
    /**
     * Writes the state of this object to a Parcel.
     *
     * @param out    The Parcel to which the state should be written.
     * @param flags  Additional flags about how the object should be written.
     * @author AnhTTH
     */
    @Override
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeFloat(rating);
    }
    /**
     * Gets the saved rating value.
     *
     * @return The saved rating value.
     * @author AnhTTH
     */
    public float getRating() {
        return rating;
    }
    /**
     * Sets the rating value to be saved.
     *
     * @param rating The rating value to be saved.
     * @author AnhTTH
     */
    public void setRating(float rating) {
        this.rating = rating;
    }
}
