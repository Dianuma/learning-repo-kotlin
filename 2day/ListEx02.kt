fun main() {
    // immutable list - List
    // mutable list - MutableList

    // var listInt: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) // mutable list : read-write
    var listInt: MutableList<Int> = arrayListOf<Int>(1, 2, 3, 4, 5) // mutable list : read-write

    println( listInt )
    listInt[0] = 100
    listInt.add(6)
    println( listInt )

    var listString: MutableList<String> = mutableListOf("Hello", "World", "Kotlin", "Java", "Python") // mutable list : read-write
    println( listString )
    listString[0] = "Hi"
    listString.add("Rust")
    listString.add(2, "Go")
    listString.removeAt(3)
    listString.remove("Python")
    println( listString )

    listString.forEach { println(it) }
    
    println( listString.indexOf("Kotlin") )
    println( listString.indexOf("Go") )
}