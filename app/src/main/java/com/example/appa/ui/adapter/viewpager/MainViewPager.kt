package com.example.appa.ui.adapter.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appa.ui.activity.main.favorite.FavoriteFragment
import com.example.appa.ui.activity.main.mysound.MySoundFragment
import com.example.appa.ui.activity.main.ringtones.RingtonesFragment
import com.example.appa.ui.activity.main.setting.SettingFragment

/**
 * Manage and display Fragments in a ViewPager Setting
 * @author AnhTTH
 */
class MainViewPager(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    /**
     * initialize Fragments only when they are accessed for the first time
     * Optimize performance and avoid unnecessary initialization
     * @author AnhTTH
     */
        private val ringtonesFragment : RingtonesFragment by lazy { RingtonesFragment() }
        private val favoriteFragment: FavoriteFragment by lazy { FavoriteFragment() }
        private val mySoundFragment: MySoundFragment by lazy { MySoundFragment() }
        private val settingFragment: SettingFragment by lazy { SettingFragment() }

    override fun getItemCount(): Int {
        return 4
    }

    /**
     * Creates and returns Fragment corresponding to position in ViewPager2
     * @author AnhTTH
     */
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> favoriteFragment
            2 -> mySoundFragment
            3 -> settingFragment
            else -> ringtonesFragment
        }
    }
}