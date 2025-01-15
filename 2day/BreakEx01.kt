fun main() {
    println("Start")

    var i: Int = 0

    outer@
    while ( i < 5 ) {
        var j: Int = 0
        while ( j < 5 ) {
            if ( j == 3 ) {
                break@outer
            }
            println("i: $i, j: $j")
            j++
        }
        i++
    }
    println("End")
}