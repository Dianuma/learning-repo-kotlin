package org.study

import java.io.File
import java.util.*

fun main() {
    // 현재 경로
    // C:\Devcours\Kotlin\App
    // java.lang.System
    println( System.getProperty("user.dir") )

    // var file: File = File("c:/java")
    var file: File = File("./")
    println(file.path) // 상대경로
    println(file.absolutePath) // 절대경로
    println(file.canonicalPath) // 절대경로

    // 파일이 존재하는지 확인
    var file2: File = File("./text.txt")
    var file3: File = File("./info.md")
    if ( file2.exists() ) {
        println("파일이 존재합니다.")
    } else {
        println("파일이 존재하지 않습니다.")
    }
    if ( file3.exists() ) {
        println("파일이 존재합니다.")
    } else {
        println("파일이 존재하지 않습니다.")
    }
    if ( file2.isDirectory ){
        println("디렉토리입니다.")
    } else {
        println("디렉토리가 아닙니다.")
    }
    if ( file3.isFile ) {
        println("파일입니다.")
    } else {
        println("파일이 아닙니다.")
    }

    var excelFile: File = File("./zipcode_seoul_utf8_type2.csv")
    println("파일 크기: ${excelFile.length()} byte")
    println("파일 크기: ${excelFile.length() / 1024} KB")
    println("파일 크기: ${excelFile.length() / 1024 / 1024} MB")
    println("마지막 수정일자: ${Date(excelFile.lastModified()).toLocaleString()}")
}