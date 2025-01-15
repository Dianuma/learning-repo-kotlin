// Overloading
fun doFunc() {
    println( "call doFunc" )
}

fun doFunc(s: String) {
    println( "call doFunc: $s" )
}

fun doFunc(s: String, a: Int) {
    println( "call doFunc: $s, $a" )
}

fun doFunc(a: Int, s: String) {
    println( "call doFunc: $a, $s" )
}

fun main() {
    doFunc()
    doFunc("Hello")
    doFunc("Hello", 100)
    doFunc(200, "Hello")
}