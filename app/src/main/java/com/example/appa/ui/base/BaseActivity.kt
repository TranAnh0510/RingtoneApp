package com.example.appa.ui.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appa.util.LanguageUtil.setLocale
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {
    /**
     * perform initialization of the activity
     * @author AnhTTH
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        this.setLocale()
        super.onCreate(savedInstanceState)
    }

    /**
     * set the locale for the activity base before it is created
     * @author AnhTTH
     */
    override fun attachBaseContext(newBase: Context) {
        newBase.setLocale()
        super.attachBaseContext(newBase)
    }
}