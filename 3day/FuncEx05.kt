// Desc: 람다 표현식을 이용한 함수 호출
val result1: (String) -> Unit = { str -> println(str) }

val result2: (String) -> Unit = { println(it) }

fun main(args: Array<String>) {
    var result3: (String) -> Unit = { println(it) }

    result1("Hello, Kotlin!")
    result2("Hello, Kotlin!")
    result3("Hello, Kotlin!")
}