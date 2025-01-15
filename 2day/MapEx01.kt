fun main() {
    var mapList: Map<String, Int> = mapOf("Kotlin" to 1, "Java" to 2, "Python" to 3, "Java" to 4, "Python" to 5, "Go" to 6, "Rust" to 7)

    println( mapList )
    println( mapList.size )
    println( mapList["Java"] )

    mapList.keys.forEach({
        println(it)
    })
    
    mapList.values.forEach({
        println(it)
    })

    mapList.forEach({
        println(it)
        println("Key: ${it.key}, Value: ${it.value}")
    })

    for ( (key, value) in mapList ) {
        println("Key: $key -> Value: $value")
    }
}