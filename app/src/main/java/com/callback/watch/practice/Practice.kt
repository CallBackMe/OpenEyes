package com.callback.watch.practice

import android.text.TextUtils
import kotlin.math.max
import kotlin.properties.Delegates

open class Practice {

    //lazy 只能用在val类型 修饰不可变的常量，
    //lateinit 只能用在var类型 修饰变量
    //lateinit修饰符只能修饰不可空类型，并且不允许修饰基础类型（四类八种基础类型int， double，boolean等）
    private val name: String = "ocean.z"
    private val ageOne: Short = 10
    private val age: Int = 30
    private val ageAll: Long = 100
    private val score: Float = 30.0F
    private val scoreAll: Double = 30.01
    private val site: Byte = 1
    private val myName: String by lazy { "ocean.zhao" }

    private var myAge: Int = 0
    private var herAge by Delegates.notNull<Int>()
    private lateinit var herName: String

    fun getMyName(name1: String, name2: String): String {
        return if (name1 == "ocean1") {
            name1
        } else if (TextUtils.equals(name2, "ocean2")) {
            name2
        } else {
            "ocean"
        }
    }

    //语法糖:当返回值只有一句代码时候，我们可以将大括号省略，用等号连接，且return也可以省略
    fun largeAge(age1: Int, age2: Int): Int = max(age1, age2)

    fun largeMyAge(age1: Int, age2: Int) = max(age1, age2)

    fun largeNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

    fun doFunction(){
        val maxAge = largeAge(11,22)
    }

    fun doPerson() {
        val person = Person()
        person.name = "ocean.zhao"
        person.age = 30
        person.eat()
    }


}