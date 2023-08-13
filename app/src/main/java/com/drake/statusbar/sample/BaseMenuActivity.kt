package com.drake.statusbar.sample

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import com.drake.engine.base.EngineActivity

open class BaseMenuActivity<T : ViewDataBinding>(@LayoutRes contentLayoutId: Int = 0) : EngineActivity<T>(contentLayoutId) {
    override fun initView() {
    }

    override fun initData() {
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.immersiveDrawerActivity -> startActivity(
                Intent(
                    this,
                    ImmersiveDrawerActivity::class.java
                )
            )

            R.id.immersiveImageActivity -> startActivity(
                Intent(
                    this,
                    ImmersiveImageActivity::class.java
                )
            )

            R.id.darkStatusBarActivity -> startActivity(
                Intent(
                    this,
                    DarkStatusBarActivity::class.java
                )
            )

            R.id.mainActivity -> startActivity(Intent(this, MainActivity::class.java))
        }
        finish()
        return super.onOptionsItemSelected(item)
    }
}