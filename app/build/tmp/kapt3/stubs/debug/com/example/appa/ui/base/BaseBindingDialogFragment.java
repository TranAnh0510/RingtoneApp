package com.example.appa.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH$J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\u001a\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u000e\u0010\u0011\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000eX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/appa/ui/base/BaseBindingDialogFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "Lcom/example/appa/ui/base/BaseDialogFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "handlerToast", "Landroid/os/Handler;", "layoutId", "", "getLayoutId", "()I", "toast", "Landroid/widget/Toast;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreatedView", "", "view", "onDestroy", "onViewCreated", "text", "", "app_debug"})
public abstract class BaseBindingDialogFragment<B extends androidx.databinding.ViewDataBinding> extends com.example.appa.ui.base.BaseDialogFragment {
    protected B binding;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Toast toast;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler handlerToast;
    
    public BaseBindingDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    protected abstract int getLayoutId();
    
    protected abstract void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    /**
     * Set the dialog view and configure the dialog window properties
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Performs additional initialization operations on the view after it has been created
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * when the fragment is about to be destroyed
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * displays a short Toast message on the screen
     * @author AnhTTH
     */
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}