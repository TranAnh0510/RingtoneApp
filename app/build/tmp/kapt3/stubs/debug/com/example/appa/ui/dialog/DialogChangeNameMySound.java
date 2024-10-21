package com.example.appa.ui.dialog;

/**
 * A dialog fragment for changing the name of a sound in "My Sounds".
 * This dialog allows the user to enter a new name for the sound and confirm the change.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u001c\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/appa/ui/dialog/DialogChangeNameMySound;", "Lcom/example/appa/ui/base/BaseBindingDialogFragment;", "Lcom/example/appa/databinding/DialogChangeNameMySoundBinding;", "()V", "layoutId", "", "getLayoutId", "()I", "onClickConfirm", "Lkotlin/Function1;", "", "", "getOnClickConfirm", "()Lkotlin/jvm/functions/Function1;", "setOnClickConfirm", "(Lkotlin/jvm/functions/Function1;)V", "initAction", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "app_debug"})
public final class DialogChangeNameMySound extends com.example.appa.ui.base.BaseBindingDialogFragment<com.example.appa.databinding.DialogChangeNameMySoundBinding> {
    
    /**
     * The action to be performed when confirming the new name.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onClickConfirm;
    
    public DialogChangeNameMySound() {
        super();
    }
    
    /**
     * The action to be performed when confirming the new name.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnClickConfirm() {
        return null;
    }
    
    /**
     * The action to be performed when confirming the new name.
     * @author AnhTTH
     */
    public final void setOnClickConfirm(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    /**
     * Called when the dialog's view is created.
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Initializes the actions for the dialog buttons.
     * @author AnhTTH
     */
    private final void initAction() {
    }
    
    /**
     * Called when the dialog is dismissed.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
}