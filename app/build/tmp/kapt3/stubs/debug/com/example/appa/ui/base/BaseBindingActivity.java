package com.example.appa.ui.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010%H&J\u000e\u0010\u000f\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0015J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020&H\u0014J\b\u0010,\u001a\u00020&H\u0014J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0010H\u0016J\u0016\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0015J\b\u00103\u001a\u00020&H&J\u0012\u00104\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H&J\u000e\u0010\u0018\u001a\u00020&2\u0006\u00105\u001a\u000206J\u0014\u00107\u001a\u00020&*\u0002082\u0006\u00109\u001a\u00020\u0010H\u0002R\u001c\u0010\u0007\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006:"}, d2 = {"Lcom/example/appa/ui/base/BaseBindingActivity;", "B", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/example/appa/ui/base/BaseViewModel;", "Lcom/example/appa/ui/base/BaseActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "handlerToast", "Landroid/os/Handler;", "isDispatchTouchEvent", "", "()Z", "setDispatchTouchEvent", "(Z)V", "layoutId", "", "getLayoutId", "()I", "toast", "Landroid/widget/Toast;", "viewModel", "getViewModel", "()Lcom/example/appa/ui/base/BaseViewModel;", "setViewModel", "(Lcom/example/appa/ui/base/BaseViewModel;)V", "Lcom/example/appa/ui/base/BaseViewModel;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "dpToPx", "dp", "Ljava/lang/Class;", "", "time", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStop", "onWindowFocusChanged", "hasFocus", "setMarginStatusBar", "textView", "Landroid/view/View;", "marginTop", "setupData", "setupView", "text", "", "setLightStatusBars", "Landroid/view/Window;", "b", "app_debug"})
public abstract class BaseBindingActivity<B extends androidx.databinding.ViewDataBinding, VM extends com.example.appa.ui.base.BaseViewModel> extends com.example.appa.ui.base.BaseActivity {
    public B binding;
    public VM viewModel;
    private boolean isDispatchTouchEvent = true;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Toast toast;
    @org.jetbrains.annotations.NotNull()
    private android.os.Handler handlerToast;
    
    public BaseBindingActivity() {
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
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    public final boolean isDispatchTouchEvent() {
        return false;
    }
    
    public final void setDispatchTouchEvent(boolean p0) {
    }
    
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Class<VM> getViewModel();
    
    public abstract void setupView(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public abstract void setupData();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * The activity is no longer in a user-interactive state
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onStop() {
    }
    
    /**
     * The activity is about to be canceled and will no longer be used
     * @author AnhTTH
     */
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    /**
     * There is a touch event sent to the activity
     * @author AnhTTH
     */
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent ev) {
        return false;
    }
    
    /**
     * temporarily disables touch event handling for a period of time
     * @author AnhTTH
     */
    public final void isDispatchTouchEvent(int time) {
    }
    
    /**
     * displays a short Toast message on the screen
     * @author AnhTTH
     */
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    /**
     * Set the status bar of the window
     * @author AnhTTH
     */
    private final void setLightStatusBars(android.view.Window $this$setLightStatusBars, boolean b) {
    }
    
    /**
     * Convert units from dp (density-independent pixels) to px (pixels)
     * @author AnhTTH
     */
    public final int dpToPx(int dp) {
        return 0;
    }
    
    /**
     * Sets the top margin for a TextView to ensure that it is not obscured by the status bar
     * @author AnhTTH
     */
    public final void setMarginStatusBar(@org.jetbrains.annotations.NotNull()
    android.view.View textView, int marginTop) {
    }
}