package com.lannstark.lec02

fun main() {
    val str: String? = "ABC"
    println(str?.length)
    println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null 이 들어 왔습니다.")
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") 
        ?: throw IllegalArgumentException("null 이 들어 왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}