package com.lannstark.lec08

//fun max(a: Int, b: Int): Int = 
//    if (a > b) {
//        a
//    } else {
//        b
//    }

fun max(a: Int, b: Int) = if (a > b) a else b

fun reapeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun main() {
    reapeat("Hello World")
    reapeat("Hello World2", useNewLine = false)
    
    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}
