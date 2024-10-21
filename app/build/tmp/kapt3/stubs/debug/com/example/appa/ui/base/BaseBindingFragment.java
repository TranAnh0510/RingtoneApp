package com.example.appa.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH$J\u0012\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\u0006\u0010\"\u001a\u00020#J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001c\u0010-\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010&\u001a\u0004\u0018\u00010\'H$J\b\u0010.\u001a\u00020%H\u0016J\u001a\u0010/\u001a\u00020%2\u0006\u0010\"\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u00100\u001a\u00020%H$J\u0010\u0010\u0017\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0007R\u001c\u0010\u0007\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00063"}, d2 = {"Lcom/example/appa/ui/base/BaseBindingFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "T", "Lcom/example/appa/ui/base/BaseViewModel;", "Lcom/example/appa/ui/base/BaseFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "callBack", "Landroidx/activity/OnBackPressedCallback;", "handlerToast", "Landroid/os/Handler;", "lastClickTime", "", "layoutId", "", "getLayoutId", "()I", "toast", "Landroid/widget/Toast;", "viewModel", "getViewModel", "()Lcom/example/appa/ui/base/BaseViewModel;", "setViewModel", "(Lcom/example/appa/ui/base/BaseViewModel;)V", "Lcom/example/appa/ui/base/BaseViewModel;", "Ljava/lang/Class;", "initSheet", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "view", "Landroid/view/View;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCreatedView", "onDestroy", "onViewCreated", "registerOnBackPress", "text", "", "app_debug"})
public abstract class BaseBindingFragment<B extends androidx.databinding.ViewDataBinding, T extends com.example.appa.ui.base.BaseViewModel> extends com.example.appa.ui.base.BaseFragment {
    public B binding;
    public T viewModel;
    private long lastClickTime = 0L;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Toast toast;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler handlerToast;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.OnBackPressedCallback callBack = null;
    
    public BaseBindingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.Class<T> getViewModel();
    
    protected abstract void registerOnBackPress();
    
    protected abstract void onCreatedView(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public abstract int getLayoutId();
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    /**
     * Create the fragment's user interface using Data Binding
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
     * initialize the viewModel using a ViewModelProvider fragment
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Performs user interface related operations after the view has been completely created
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * displays a short Toast message on the screen
     * @author AnhTTH
     */
    @android.annotation.SuppressLint(value = {"ShowToast"})
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<?> initSheet(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
}