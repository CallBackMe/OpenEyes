package com.callback.watch

import android.app.Application
import android.content.Context
import com.callback.watch.common.util.logE

class WatchApplication : Application() {

    companion object {
        private const val TAG = "WatchApplication"
        lateinit var context: Context
    }

    init {
        var name = "jianzong"
        logE(TAG,"  +++++++++++++++++  WatchApplication  init ----- {$name} ")
    }

    override fun onCreate() {
        super.onCreate()
        logE(TAG,"  +++++++++++++++++  WatchApplication  onCreate ----- ")
        context = this
    }

}