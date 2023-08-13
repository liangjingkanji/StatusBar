package com.drake.statusbar.sample

import com.drake.statusbar.darkMode
import com.drake.statusbar.sample.databinding.ActivityDarkStatusBarBinding

class DarkStatusBarActivity : BaseMenuActivity<ActivityDarkStatusBarBinding>(R.layout.activity_dark_status_bar) {
    override fun initView() {
        darkMode()
    }
}