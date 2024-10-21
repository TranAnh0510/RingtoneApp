package com.example.appa.ui.dialog;

/**
 * Dialog fragment for sorting options.
 * @author AnhTTh
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\u001c\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0016\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\f\u0010\u001e\u001a\u00020\n*\u00020\u001fH\u0002J\f\u0010 \u001a\u00020\n*\u00020\u001fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/example/appa/ui/dialog/DialogSort;", "Lcom/example/appa/ui/base/BaseBindingDialogFragment;", "Lcom/example/appa/databinding/DialogSortBinding;", "()V", "layoutId", "", "getLayoutId", "()I", "onClickTypeSort", "Lkotlin/Function1;", "", "getOnClickTypeSort", "()Lkotlin/jvm/functions/Function1;", "setOnClickTypeSort", "(Lkotlin/jvm/functions/Function1;)V", "posX", "", "posY", "typeSort", "getTypeSort", "setTypeSort", "(I)V", "initAction", "initLayoutParam", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDialogSort", "setNoSelect", "Lcom/example/appa/ui/customview/RippleCornerTextView;", "setSelect", "app_debug"})
public final class DialogSort extends com.example.appa.ui.base.BaseBindingDialogFragment<com.example.appa.databinding.DialogSortBinding> {
    private float posX = 0.0F;
    private float posY = 0.0F;
    private int typeSort = 1;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onClickTypeSort;
    
    public DialogSort() {
        super();
    }
    
    public final int getTypeSort() {
        return 0;
    }
    
    public final void setTypeSort(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnClickTypeSort() {
        return null;
    }
    
    public final void setOnClickTypeSort(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    /**
     * Called when the view is created.
     * @author AnhTTh
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Shows the sort dialog.
     * @param posX The x-coordinate of the dialog.
     * @param posY The y-coordinate of the dialog.
     * @author AnhTTh
     */
    public final void showDialogSort(float posX, float posY) {
    }
    
    /**
     * Initializes actions for UI elements.
     * @author AnhTTh
     */
    private final void initAction() {
    }
    
    /**
     * Sets the view as selected.
     * @author AnhTTh
     */
    private final void setSelect(com.example.appa.ui.customview.RippleCornerTextView $this$setSelect) {
    }
    
    /**
     * Sets the view as not selected.
     * @author AnhTTh
     */
    private final void setNoSelect(com.example.appa.ui.customview.RippleCornerTextView $this$setNoSelect) {
    }
    
    /**
     * Initializes layout parameters.
     * @author AnhTTh
     */
    private final void initLayoutParam() {
    }
}