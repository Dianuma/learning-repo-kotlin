package org.study

import java.io.File

fun main() {
    File("./info.md").forEachLine {
        println(it)
    }

    val text: String = File("./info.md").readText()
    println(text)
}