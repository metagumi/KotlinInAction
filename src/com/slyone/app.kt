package com.slyone

fun main(args: Array<String>) {
    println("Hello, world!")
    println(max(4, 3))
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}