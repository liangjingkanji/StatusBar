package com.drake.statusbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.drake.library.immersiveDark
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        immersiveDark(toolbar)
        // or immersive(toolbar)
    }
}
