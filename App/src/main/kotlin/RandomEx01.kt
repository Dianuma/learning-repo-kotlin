package org.study

import kotlin.random.Random

fun main() {
    var lists = List(10) { Random.nextInt(0, 100) }
    println(lists)
}