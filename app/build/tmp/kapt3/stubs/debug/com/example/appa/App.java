package com.example.appa;

/**
 * Application class for the app.
 * Annotated with [@HiltAndroidApp](https://developer.android.com/training/dependency-injection/hilt-android#application).
 * @author AnhTTH
 */
@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/example/appa/App;", "Landroid/app/Application;", "()V", "mNetworkReceiver", "Lcom/example/appa/receiver/NetworkChangeReceiver;", "sharedPreferenceHelper", "Lcom/example/appa/data/local/shared/SharedPreferenceHelper;", "getSharedPreferenceHelper", "()Lcom/example/appa/data/local/shared/SharedPreferenceHelper;", "setSharedPreferenceHelper", "(Lcom/example/appa/data/local/shared/SharedPreferenceHelper;)V", "initLog", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "registerNetworkBroadcastForNougat", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @javax.inject.Inject()
    public com.example.appa.data.local.shared.SharedPreferenceHelper sharedPreferenceHelper;
    @org.jetbrains.annotations.Nullable()
    private com.example.appa.receiver.NetworkChangeReceiver mNetworkReceiver;
    private static boolean forceUpdate = false;
    public static com.example.appa.App instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.appa.App.Companion Companion = null;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.appa.data.local.shared.SharedPreferenceHelper getSharedPreferenceHelper() {
        return null;
    }
    
    public final void setSharedPreferenceHelper(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.shared.SharedPreferenceHelper p0) {
    }
    
    /**
     * Called when the application is starting.
     * Initializes essential components of the application.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * Registers the network change broadcast receiver for Android Nougat and above.
     * @author AnhTTH
     */
    private final void registerNetworkBroadcastForNougat() {
    }
    
    /**
     * Initializes logging if the app is in debug mode.
     * @author AnhTTH
     */
    private final void initLog() {
    }
    
    /**
     * Called by the system when the device configuration changes while your component is running.
     * Updates the locale based on the new configuration.
     * @param newConfig The new device configuration.
     * @author AnhTTH
     */
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/appa/App$Companion;", "", "()V", "forceUpdate", "", "getForceUpdate", "()Z", "setForceUpdate", "(Z)V", "instance", "Lcom/example/appa/App;", "getInstance", "()Lcom/example/appa/App;", "setInstance", "(Lcom/example/appa/App;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getForceUpdate() {
            return false;
        }
        
        public final void setForceUpdate(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.appa.App getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.example.appa.App p0) {
        }
    }
}