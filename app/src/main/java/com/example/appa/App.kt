package com.example.appa

import android.app.Application
import android.content.IntentFilter
import android.content.res.Configuration
import android.net.ConnectivityManager
import com.example.appa.data.local.shared.SharedPreferenceHelper
import com.example.appa.receiver.NetworkChangeReceiver
import com.example.appa.util.LanguageUtil.setLocale
import com.example.appa.util.MyDebugTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

/**
 * Application class for the app.
 * Annotated with [@HiltAndroidApp](https://developer.android.com/training/dependency-injection/hilt-android#application).
 * @author AnhTTH
 */
@HiltAndroidApp
class App : Application() {
    // Injected shared preference helper
    @Inject
    lateinit var sharedPreferenceHelper: SharedPreferenceHelper

    // Network change receiver instance
    private var mNetworkReceiver: NetworkChangeReceiver? = null

    /**
     * Called when the application is starting.
     * Initializes essential components of the application.
     * @author AnhTTH
     */
    override fun onCreate() {
        super.onCreate()
        instance = this
        // Create network change receiver instance
        mNetworkReceiver = NetworkChangeReceiver()
        // Register network broadcast receiver for Nougat and above
        registerNetworkBroadcastForNougat()
        // Initialize logging if in debug mode
        initLog()

    }

    /**
     * Registers the network change broadcast receiver for Android Nougat and above.
     * @author AnhTTH
     */
    private fun registerNetworkBroadcastForNougat() {
        // Register the network change broadcast receiver
        registerReceiver(
            mNetworkReceiver, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
    }

    /**
     * Initializes logging if the app is in debug mode.
     * @author AnhTTH
     */
    private fun initLog() {
        if (BuildConfig.DEBUG) {
            Timber.plant(MyDebugTree())
        }
    }

    companion object {
        // Indicates if a force update is required
        var forceUpdate: Boolean = false

        // Singleton instance of the application
        lateinit var instance: App
    }

    /**
     * Called by the system when the device configuration changes while your component is running.
     * Updates the locale based on the new configuration.
     * @param newConfig The new device configuration.
     * @author AnhTTH
     */
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        // Update locale based on the new configuration
        this.setLocale()
    }
}