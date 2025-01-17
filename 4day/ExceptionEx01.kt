// Desc: Handle exception in Kotlin
fun count(): Int {
    val a = 0
    return 10 / a
}

fun main() {
    val num: Int = try {
        count()
    } catch (e: ArithmeticException) {
        -1
    }

    println( "Result: $num" )
}