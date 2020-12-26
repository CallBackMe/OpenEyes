package com.callback.watch

import android.app.Application
import android.content.Context
import com.callback.watch.extension.logE

class WatchApplication : Application() {

    companion object {
        private const val TAG = "WatchApplication"
        lateinit var context: Context
    }

    init {
        logE(TAG,"  +++++++++++++++++  WatchApplication  init ----- ")
    }

    override fun onCreate() {
        super.onCreate()
        logE(TAG,"  +++++++++++++++++  WatchApplication  onCreate ----- ")
        context = this
    }

}