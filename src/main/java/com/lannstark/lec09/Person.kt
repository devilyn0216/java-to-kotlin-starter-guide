package com.lannstark.lec09

fun main() {
    val person = Person("kim", 100)
    
    println(person.name)
    person.age = 33
    println(person.age)
}

class Person(
    val name: String,
    var age: Int,
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }
    
    constructor(name: String): this(name, 1)

//    fun isAdult(): Boolean {
//        return age >= 20
//    }
    
    val isAdult: Boolean
        get() = age >= 20
    
    val uppercaseName: String
        get() = this.name.uppercase()
}
