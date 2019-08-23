/*
 * Copyright (C) 2018, Umbrella CompanyLimited All rights reserved.
 * Project：StatusBar
 * Author：两津勘吉
 * Date：8/24/19 5:28 AM
 */

package com.drake.statusbar.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.drake.statusbar.immersiveDark
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        immersiveDark(toolbar)
        // or immersive(toolbar)
    }
}
