package org.study

import java.io.File

fun main() {
    // 디렉토리 내부 목록
    var file: File = File("c:/java")

    // 자식
    var lists: Array<String> = file.list()!!
    println( lists.contentToString() )

    // 손자 ( Recursive )
    file.walk().forEach { println(it) }
}