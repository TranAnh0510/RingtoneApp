package com.example.appa.ui.dialog;

/**
 * The DialogRate class extends BaseBindingDialogFragment and represents a dialog
 * for rating purposes.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002J\u001c\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J$\u0010\u001c\u001a\u00020\n*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/example/appa/ui/dialog/DialogRate;", "Lcom/example/appa/ui/base/BaseBindingDialogFragment;", "Lcom/example/appa/databinding/DialogRateBinding;", "()V", "layoutId", "", "getLayoutId", "()I", "onClickFiveStar", "Lkotlin/Function0;", "", "getOnClickFiveStar", "()Lkotlin/jvm/functions/Function0;", "setOnClickFiveStar", "(Lkotlin/jvm/functions/Function0;)V", "onDismiss", "getOnDismiss", "setOnDismiss", "onRating", "getOnRating", "setOnRating", "initAction", "initListener", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setDataRate", "Landroid/content/Context;", "title", "content", "icon", "app_debug"})
public final class DialogRate extends com.example.appa.ui.base.BaseBindingDialogFragment<com.example.appa.databinding.DialogRateBinding> {
    
    /**
     * Callback for when the user clicks on five stars.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickFiveStar;
    
    /**
     * Callback for when rating occurs.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onRating;
    
    /**
     * Callback for when the dialog is dismissed.
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss;
    
    public DialogRate() {
        super();
    }
    
    /**
     * Callback for when the user clicks on five stars.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickFiveStar() {
        return null;
    }
    
    /**
     * Callback for when the user clicks on five stars.
     */
    public final void setOnClickFiveStar(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * Callback for when rating occurs.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRating() {
        return null;
    }
    
    /**
     * Callback for when rating occurs.
     */
    public final void setOnRating(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    /**
     * Callback for when the dialog is dismissed.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismiss() {
        return null;
    }
    
    /**
     * Callback for when the dialog is dismissed.
     */
    public final void setOnDismiss(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    /**
     * Fragment view is created
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Register a listener for RatingBar to listen for user changes
     * @author AnhTTH
     */
    private final void initListener() {
    }
    
    /**
     * set data to update the user interface
     * @author AnhTTH
     */
    private final void setDataRate(android.content.Context $this$setDataRate, int title, int content, int icon) {
    }
    
    /**
     * Set actions for interface elements
     * event handling when user clicks on rating btnRate and exit tvExit
     * @author AnhTTH
     */
    private final void initAction() {
    }
}