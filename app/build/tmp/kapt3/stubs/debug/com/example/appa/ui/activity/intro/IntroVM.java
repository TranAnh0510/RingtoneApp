package com.example.appa.ui.activity.intro;

/**
 * ViewModel for managing the data of the intro screens.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/appa/ui/activity/intro/IntroVM;", "Lcom/example/appa/ui/base/BaseViewModel;", "()V", "_introMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/appa/data/model/IntroUI;", "introMutableLiveData", "Landroidx/lifecycle/LiveData;", "getIntroMutableLiveData", "()Landroidx/lifecycle/LiveData;", "getIntro", "", "context", "Landroid/content/Context;", "app_debug"})
public final class IntroVM extends com.example.appa.ui.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.appa.data.model.IntroUI>> _introMutableLiveData = null;
    
    public IntroVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.appa.data.model.IntroUI>> getIntroMutableLiveData() {
        return null;
    }
    
    /**
     * Retrieves the introductory data and updates the LiveData.
     * @param context The application context used to access resources.
     * @author AnhTTH
     */
    public final void getIntro(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}