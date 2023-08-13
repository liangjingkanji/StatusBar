package com.drake.statusbar.sample

import com.drake.statusbar.immersive
import com.drake.statusbar.sample.databinding.ActivityImmerseImageBinding
import com.drake.statusbar.setActionBarTransparent

class ImmersiveImageActivity : BaseMenuActivity<ActivityImmerseImageBinding>(R.layout.activity_immerse_image) {
    override fun initView() {
        setActionBarTransparent()
        immersive()
    }
}