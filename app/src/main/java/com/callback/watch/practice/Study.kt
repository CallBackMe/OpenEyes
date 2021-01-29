package com.callback.watch.practice

import com.callback.watch.common.util.logE

interface Study {

    fun readBook()

    fun doHomeWork() {
        logE("ocean","do some homeworks ~")
    }

}