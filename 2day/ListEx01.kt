fun main() {
    // immutable list - List
    // mutable list - MutableList

    // var listInt: List<Int> = listOf(1, 2, 3, 4, 5) // immutable list : read-only
    var listInt: List<Int> = arrayListOf<Int>(1, 2, 3, 4, 5) // immutable list : read-only

    println( listInt )

    var listString: List<String> = listOf("Hello", "World", "Kotlin", "Java", "Python") // immutable list : read-only
    println( listString )

    listString.forEach { println(it) }


    println( listString.indexOf("Go") )
    println( listString.indexOf("Kotlin") )
}