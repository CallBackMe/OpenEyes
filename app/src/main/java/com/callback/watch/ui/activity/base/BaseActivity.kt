package com.callback.watch.ui.activity.base

import android.os.Bundle
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity
import com.callback.watch.R
import com.callback.watch.extension.logE
import com.gyf.immersionbar.ImmersionBar

open class BaseActivity : AppCompatActivity() {

    companion object {
        public const val TAG = "ocean"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logE(TAG, " +++++++++++++++++++ current Class name = ${this.javaClass.simpleName}")
        setStatusBarBackground(R.color.colorPrimaryDark)

    }

    /**
     * 设置状态栏背景色
     */
    open fun setStatusBarBackground(@ColorRes statusBarColor: Int) {
        ImmersionBar.with(this).autoStatusBarDarkModeEnable(true, 0.2f).statusBarColor(statusBarColor).fitsSystemWindows(true).init()
    }


}