package com.example.appa.ui.dialog;

/**
 * A dialog fragment for selecting ascending or descending order.
 * This dialog allows the user to choose between ascending and descending order for sorting.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u001c\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0016\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\f\u0010\u001f\u001a\u00020\u000f*\u00020 H\u0002J\f\u0010!\u001a\u00020\u000f*\u00020 H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/appa/ui/dialog/DialogAscending;", "Lcom/example/appa/ui/base/BaseBindingDialogFragment;", "Lcom/example/appa/databinding/DialogAscendingBinding;", "()V", "isAscending", "", "()Z", "setAscending", "(Z)V", "layoutId", "", "getLayoutId", "()I", "onClickAscending", "Lkotlin/Function1;", "", "getOnClickAscending", "()Lkotlin/jvm/functions/Function1;", "setOnClickAscending", "(Lkotlin/jvm/functions/Function1;)V", "posX", "", "posY", "initAction", "initLayoutParam", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "setNoSelect", "Lcom/example/appa/ui/customview/RippleCornerTextView;", "setSelect", "app_debug"})
public final class DialogAscending extends com.example.appa.ui.base.BaseBindingDialogFragment<com.example.appa.databinding.DialogAscendingBinding> {
    private float posX = 0.0F;
    private float posY = 0.0F;
    private boolean isAscending = true;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onClickAscending;
    
    public DialogAscending() {
        super();
    }
    
    public final boolean isAscending() {
        return false;
    }
    
    public final void setAscending(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnClickAscending() {
        return null;
    }
    
    public final void setOnClickAscending(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    /**
     * Called when the dialog's view is created.
     * @author AnhTTh
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Shows the dialog at the specified position.
     * @param posX The x-coordinate of the dialog's position.
     * @param posY The y-coordinate of the dialog's position.
     * @author AnhTTh
     */
    public final void showDialog(float posX, float posY) {
    }
    
    /**
     * Initializes the actions for the dialog buttons.
     * @author AnhTTh
     */
    private final void initAction() {
    }
    
    /**
     * Sets the appearance of the text view as selected.
     * @author AnhTTh
     */
    private final void setSelect(com.example.appa.ui.customview.RippleCornerTextView $this$setSelect) {
    }
    
    /**
     * Sets the appearance of the text view as not selected.
     * @author AnhTTh
     */
    private final void setNoSelect(com.example.appa.ui.customview.RippleCornerTextView $this$setNoSelect) {
    }
    
    /**
     * Initializes the layout parameters of the dialog.
     * @author AnhTTh
     */
    private final void initLayoutParam() {
    }
}