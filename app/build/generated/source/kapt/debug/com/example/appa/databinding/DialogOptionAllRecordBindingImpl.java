package com.example.appa.databinding;
import com.example.appa.R;
import com.example.appa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogOptionAllRecordBindingImpl extends DialogOptionAllRecordBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imRecord, 1);
        sViewsWithIds.put(R.id.tvNameRecord, 2);
        sViewsWithIds.put(R.id.tvInformation, 3);
        sViewsWithIds.put(R.id.tvEdit, 4);
        sViewsWithIds.put(R.id.tvChangeName, 5);
        sViewsWithIds.put(R.id.tvAddToMySound, 6);
        sViewsWithIds.put(R.id.tvAddToFavorite, 7);
        sViewsWithIds.put(R.id.tvSetRingtone, 8);
        sViewsWithIds.put(R.id.tvSetMessage, 9);
        sViewsWithIds.put(R.id.tvSetNotification, 10);
        sViewsWithIds.put(R.id.tvDelete, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DialogOptionAllRecordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogOptionAllRecordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[7]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[6]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[5]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[11]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[9]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[10]
            , (com.example.appa.ui.customview.RippleCornerTextView) bindings[8]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
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