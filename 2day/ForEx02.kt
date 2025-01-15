fun main() {
    println("Start")

    for (i in 'a'..'e') {
        println("i: $i")
    }

    // 문자열 - 문자 배열
    var alphabet: String = "ABCDE"
    for (char in alphabet) {
        println("char: $char")
    }

    println("End")
}