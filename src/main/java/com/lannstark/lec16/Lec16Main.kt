package com.lannstark.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
    
    val person = Person("Kim", "Kitae", 2)
    println(person.nextYearAge())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}