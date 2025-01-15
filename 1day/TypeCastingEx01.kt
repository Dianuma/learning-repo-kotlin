fun main() {
    // 객체형 자료
    var a = 10.0
    // var c = a == 10  // Error : Type mismatch
    // var c: Int = a   // Error : Type mismatch

    var c: Int = a.toInt()
    println( c )
}