package org.study

fun main() {
    // 로또번호 추출기, 안겹치게 5줄 6개
    val lotto = List(5) {
        generateSequence { (1..45).random() }
            .distinct()
            .take(6)
            .toList()
    }.forEach(::println)
}