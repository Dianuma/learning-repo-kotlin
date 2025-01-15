fun main() {
    // var arrValue: Array<Int> = arrayOf(0, 2, 3, 6, 7)
    // var arrValue: Array<String> = arrayOf("Hello", "World", "Kotlin", "Java", "Python")
    // var arrValue: Array<Any> = arrayOf(0, 2, 3, 6, 7, "Hello", "World", "Kotlin", "Java", "Python")

    // arrValue.forEach({
    //     println( it )
    // })

    var arrValue = arrayOfNulls<Int>(3)

    println( arrValue.contentToString() )
}