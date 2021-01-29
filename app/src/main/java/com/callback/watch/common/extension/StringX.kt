package com.callback.watch.common.extension

import android.widget.Toast
import com.callback.watch.WatchApplication

fun String.showToast(duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(WatchApplication.context,this,duration).show()
}