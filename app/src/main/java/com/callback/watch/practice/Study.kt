package com.callback.watch.practice

import com.callback.watch.extension.logE

interface Study {

    fun readBook()

    fun doHomeWork() {
        logE("ocean","do some homeworks ~")
    }

}