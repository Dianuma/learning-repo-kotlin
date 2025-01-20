package org.study

import kotlin.math.*

// Math
// 올림 | 내림 | 반올림
// sin | cos | tan ..

fun main() {
    var x: Double = 5.7
    var y: Double = 5.5
    var z: Double = 5.3

    println("ceil($x) = ${ceil(x)}")
    println("ceil($y) = ${ceil(y)}")
    println("ceil($z) = ${ceil(z)}")

    println("floor($x) = ${floor(x)}")
    println("floor($y) = ${floor(y)}")
    println("floor($z) = ${floor(z)}")

    println("round($x) = ${round(x)}")
    println("round($y) = ${round(y)}")
    println("round($z) = ${round(z)}")

    var intRange1: IntRange = 1..10
    var intRange2: IntRange = 1 until 10
    println("intRange = $intRange1")
    println("intRange = $intRange2")
    println(intRange1.random())
    println(intRange2.random())
}