package com.lannstark.lec02

fun main() {
    val person = Person("김기태")
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}