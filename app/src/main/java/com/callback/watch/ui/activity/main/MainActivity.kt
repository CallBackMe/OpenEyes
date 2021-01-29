package com.callback.watch.ui.activity.main

import android.os.Bundle
import com.callback.watch.R
import com.callback.watch.common.extension.showToast
import com.callback.watch.common.util.GlobalUtil
import com.callback.watch.ui.activity.base.BaseActivity

class MainActivity : BaseActivity() {

    private var backPressTime: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onBackPressed() {
        processBackPressed()
    }

    private fun processBackPressed() {
        val now = System.currentTimeMillis()
        if (now - backPressTime > 2000) {
            String.format(GlobalUtil.getString(R.string.press_again_to_exit), GlobalUtil.appName).showToast()
            backPressTime = now
        } else {
            super.onBackPressed()
        }
    }

}