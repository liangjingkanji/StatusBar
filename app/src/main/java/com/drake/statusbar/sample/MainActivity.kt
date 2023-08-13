package com.drake.statusbar.sample

import com.drake.statusbar.immersive
import com.drake.statusbar.sample.databinding.ActivityMainBinding

class MainActivity : BaseMenuActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun initView() {
        binding.toolbar.inflateMenu(R.menu.menu_main)
        binding.toolbar.setOnMenuItemClickListener { onOptionsItemSelected(it) }
        immersive(binding.toolbar) // or dark status bar
        // immersive(toolbar, true)
    }
}
