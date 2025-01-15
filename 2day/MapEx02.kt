fun main() {
    var mapList: MutableMap<String, Int> = mutableMapOf("Kotlin" to 1, "Java" to 2, "Python" to 3, "Java" to 4, "Python" to 5, "Go" to 6, "Rust" to 7)

    println( mapList )

    mapList["C++"] = 8
    mapList["Java"] = 8
    mapList.put("C#", 9)
    mapList.put("Java", 9)
    println( mapList )

    mapList.remove("Java")
    println( mapList )

}