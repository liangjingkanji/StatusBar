package com.drake.statusbar.sample

import androidx.appcompat.app.ActionBarDrawerToggle
import com.drake.statusbar.immersive
import com.drake.statusbar.sample.databinding.ActivityImmersiveDrawerBinding
import com.drake.statusbar.statusPadding

class ImmersiveDrawerActivity : BaseMenuActivity<ActivityImmersiveDrawerBinding>(R.layout.activity_immersive_drawer) {
    override fun initView() {
        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawer,
            binding.toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

        // 使抽屉展开后是半透明状态栏
        immersive()
        binding.toolbar.statusPadding()

        // 以下属于全透明状态栏方案
        // immersive()
        // toolbar.statusPadding()

        // 如果不需要抽屉展开后是半透明状态栏直接设置以下即可, 以下属于设置状态栏颜色方案
        // immersive(toolbar)

        binding.toolbar.inflateMenu(R.menu.menu_main)
        binding.toolbar.setOnMenuItemClickListener { onOptionsItemSelected(it) }
    }
}