package com.example.appa.databinding;
import com.example.appa.R;
import com.example.appa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomBottomNavigationBindingImpl extends CustomBottomNavigationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.con_1, 1);
        sViewsWithIds.put(R.id.itemNewSound, 2);
        sViewsWithIds.put(R.id.layoutRingtone, 3);
        sViewsWithIds.put(R.id.imRingtones, 4);
        sViewsWithIds.put(R.id.tvRingtones, 5);
        sViewsWithIds.put(R.id.layoutFavorite, 6);
        sViewsWithIds.put(R.id.imFavorite, 7);
        sViewsWithIds.put(R.id.tvFavorite, 8);
        sViewsWithIds.put(R.id.layoutMySound, 9);
        sViewsWithIds.put(R.id.imMySound, 10);
        sViewsWithIds.put(R.id.tvMySound, 11);
        sViewsWithIds.put(R.id.layoutSetting, 12);
        sViewsWithIds.put(R.id.imSetting, 13);
        sViewsWithIds.put(R.id.tvSetting, 14);
        sViewsWithIds.put(R.id.itemRingtones, 15);
        sViewsWithIds.put(R.id.itemFavorite, 16);
        sViewsWithIds.put(R.id.itemMySound, 17);
        sViewsWithIds.put(R.id.itemSetting, 18);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomBottomNavigationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private CustomBottomNavigationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.view.View) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[13]
            , (android.view.View) bindings[16]
            , (android.view.View) bindings[17]
            , (android.widget.ImageView) bindings[2]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[18]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            );
        this.bottomNav.setTag(null);
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