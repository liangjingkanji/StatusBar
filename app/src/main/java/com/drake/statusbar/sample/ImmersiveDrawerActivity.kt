/*
 * Copyright (C) 2018 Drake, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drake.statusbar.sample

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import com.drake.statusbar.immersive
import com.drake.statusbar.statusPadding
import kotlinx.android.synthetic.main.activity_immersive_drawer.*

class ImmersiveDrawerActivity : BaseMenuActivity(R.layout.activity_immersive_drawer) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val toggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        // 使抽屉展开后是半透明状态栏
        immersive()
        toolbar.statusPadding()

        // 以下属于全透明状态栏方案
        // immersive()
        // toolbar.statusPadding()

        // 如果不需要抽屉展开后是半透明状态栏直接设置以下即可, 以下属于设置状态栏颜色方案
        // immersive(toolbar)

        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setOnMenuItemClickListener { onOptionsItemSelected(it) }
    }
}