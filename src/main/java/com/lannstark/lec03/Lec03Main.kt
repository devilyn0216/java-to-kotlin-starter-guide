package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()
    
    val person = Person("kim", 100)
    println("name : ${person.name}, age : ${person.age}")
    
    val str = "ABC"
    println(str[0])
    println(str[1])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj .age)
    }
}