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

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class BaseMenuActivity : AppCompatActivity() {

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