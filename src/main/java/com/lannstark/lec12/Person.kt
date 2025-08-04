package com.lannstark.lec12

class Person private constructor(
    private var name: String,
    private var age: Int,
) {
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }
    }
}