fun main() {
    println("Start")

    for ( i in 1..10 ) {
        println("*".repeat(i))
    }
    for ( i in 10 downTo 1 ) {
        println("*".repeat(i))
    }
    for ( i in 1..10 ) {
        for ( j in 1..i ) {
            print('A' + j - 1)
        }
        println()
    }

    println("End")
}