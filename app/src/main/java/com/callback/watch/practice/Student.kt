package com.callback.watch.practice

import com.callback.watch.extension.logE

//函数的可见性修饰符：public 所有类可见（默认）；private	当前类可见；
//protected  当前类、子类可见；internal  同一模块中的类可见

//Kotlin是使用class关键字来声明类

//Kotlin中任何一个非抽象类默认都是不可以被继承的，而抽象类如果不继承就无任何意义，所以必须被继承。想要让一个类可以被继承，其实很简单，加上一个open关键字就可以了

//Kotlin中，有两类构造函数，主构造函数与次构造函数，主构造函数只能有一个，且没有函数体。直接定义在类名的后面。而次构造函数则是可以有任意多个，且有函数体。

//Kotlin中，主构造函数用init()函数初始化


//Kotlin是使用interface关键字来声明接口，实现接口的关键字也是冒号，且只需要复写方法即可。

//Kotlin中接口的关键字也是冒号，支持为接口定义默认函数体，使得实现类不需要实现这个方法。

class Student(name: String, age: Int) : Person(), Study {

    init {
        if (name == "ocean") {
            logE("ocean", "student name is ${name}")
        }
    }

    constructor(name: String, age: Int, school: String) : this(name, age) {


    }

    override fun readBook() {
        logE("ocean", " study is reading book ~ ")
    }

}