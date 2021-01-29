package com.callback.watch.practice

import com.callback.watch.common.util.logE

open class Person {

    companion object {
        public const val TAG = "Person"
    }

    public var name = ""
    public var age = 0

    fun eat() {
        logE(TAG,"++++ my name is ${name}, my age is ${age} ~")
    }

}