var name1: String = "Tom"
lateinit var name2: String // lateinit : 지연초기화

fun initialize() {
    name2 = "Kevin"
}

fun main() {
    println( name1 )

    initialize()
    println( name2 )
}