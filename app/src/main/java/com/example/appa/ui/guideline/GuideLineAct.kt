package com.example.appa.ui.guideline

import android.os.Bundle
import com.example.appa.R
import com.example.appa.databinding.ActivityGuideLineBinding
import com.example.appa.ui.base.BaseBindingActivity
import com.example.appa.util.extension.setFullScreen
import com.example.appa.util.extension.setOnSafeClick

class GuideLineAct : BaseBindingActivity<ActivityGuideLineBinding, GuideLineVM>() {
    override val layoutId: Int
        get() = R.layout.activity_guide_line

    override fun getViewModel(): Class<GuideLineVM> = GuideLineVM::class.java

    override fun setupView(savedInstanceState: Bundle?) {
        setFullScreen()
        setMarginStatusBar(binding.tvTitle, 8)
        initAction()
    }

    override fun setupData() {

    }

    private fun initAction() {
        binding.imBack.setOnSafeClick {
            finish()
        }
    }
}