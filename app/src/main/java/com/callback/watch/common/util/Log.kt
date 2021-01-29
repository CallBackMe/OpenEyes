package com.callback.watch.common.util

import android.util.Log
import com.callback.watch.BuildConfig

/**
 * 日志管理工具
 */
public const val VERBOSE = 1
public const val DEBUG = 2
public const val INFO = 3
public const val WARN = 4
public const val ERROR = 5

private val level = if (BuildConfig.DEBUG) VERBOSE else WARN

fun logV(tag: String, message: String?) {
    if (level <= VERBOSE && BuildConfig.SHOW_LOG) {
        Log.v(tag, message.toString())
    }
}

fun logD(tag: String, message: String?) {
    if (level <= DEBUG && BuildConfig.SHOW_LOG) {
        Log.d(tag, message.toString())
    }
}

fun logI(tag: String, message: String?) {
    if (level <= INFO && BuildConfig.SHOW_LOG) {
        Log.i(tag, message.toString())
    }
}

fun logW(tag: String, message: String?) {
    if (level <= WARN && BuildConfig.SHOW_LOG) {
        Log.w(tag, message.toString())
    }
}

fun logE(tag: String, message: String?) {
    if (level <= ERROR && BuildConfig.SHOW_LOG) {
        Log.e(tag, message.toString())
    }
}

fun logW(tag: String, msg: String?, tr: Throwable? = null) {
    if (level <= WARN) {
        if (tr == null) {
            Log.w(tag, msg.toString())
        } else {
            Log.w(tag, msg.toString(), tr)
        }
    }
}

fun logE(tag: String, msg: String?, tr: Throwable) {
    if (level <= ERROR) {
        Log.e(tag, msg.toString(), tr)
    }
}