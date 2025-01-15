fun main() {
    var mutableList: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Python", "Java", "Python", "Go", "Rust")
    println( mutableList )

    mutableList.add("C++")
    println( mutableList )

    mutableList.add("Java")
    println( mutableList )

    mutableList.remove("Java")
    println( mutableList )
}