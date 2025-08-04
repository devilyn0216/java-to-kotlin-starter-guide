package com.lannstark.lec12

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("move!!")
        }

        override fun fly() {
            println("fly!!")
        }
    })
}

private fun moveSomething(moveable: Movable) {
    moveable.move()
    moveable.fly()
}