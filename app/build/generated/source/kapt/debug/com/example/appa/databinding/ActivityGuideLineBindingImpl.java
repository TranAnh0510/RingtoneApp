package com.example.appa.databinding;
import com.example.appa.R;
import com.example.appa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityGuideLineBindingImpl extends ActivityGuideLineBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imBack, 1);
        sViewsWithIds.put(R.id.tvTitle, 2);
        sViewsWithIds.put(R.id.tvWelcome, 3);
        sViewsWithIds.put(R.id.tvContentWelcome, 4);
        sViewsWithIds.put(R.id.tvCreate, 5);
        sViewsWithIds.put(R.id.tvContentCreate, 6);
        sViewsWithIds.put(R.id.cvLofiSound, 7);
        sViewsWithIds.put(R.id.tvLofiSound, 8);
        sViewsWithIds.put(R.id.tvContentLofi, 9);
        sViewsWithIds.put(R.id.cvRockSound, 10);
        sViewsWithIds.put(R.id.tvRockSound, 11);
        sViewsWithIds.put(R.id.tvContentRock, 12);
        sViewsWithIds.put(R.id.cvBallad, 13);
        sViewsWithIds.put(R.id.tvBallad, 14);
        sViewsWithIds.put(R.id.tvContentBallad, 15);
        sViewsWithIds.put(R.id.cvPopSound, 16);
        sViewsWithIds.put(R.id.tvPopSound, 17);
        sViewsWithIds.put(R.id.tvContentPop, 18);
        sViewsWithIds.put(R.id.tvCut, 19);
        sViewsWithIds.put(R.id.tvContentCut, 20);
        sViewsWithIds.put(R.id.imSoundWave, 21);
        sViewsWithIds.put(R.id.tvStore, 22);
        sViewsWithIds.put(R.id.tvContentStore, 23);
        sViewsWithIds.put(R.id.tvSupport, 24);
        sViewsWithIds.put(R.id.tvContentSupport, 25);
        sViewsWithIds.put(R.id.tvThankyou, 26);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityGuideLineBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityGuideLineBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[13]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[16]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}