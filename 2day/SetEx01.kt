fun main() {
    var readOnlyList: Set<String> = setOf("Kotlin", "Java", "Python", "Java", "Python", "Go", "Rust") // immutable list : read-only | Set : no duplicate elements | no order of elements

    println( readOnlyList )
    println( readOnlyList.size )
    println( readOnlyList.contains("Kotlin") )
    println( readOnlyList.indexOf("Python") )
    readOnlyList.forEach { println(it) }
}
