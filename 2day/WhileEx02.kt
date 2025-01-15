fun main() {
    var i: Int = 1

    while ( i < 10 ) {
        var j: Int = 1
        while ( j < 10 ) {
            print("$i X $j = %2d    ".format(i * j))
            j++
        }
        println()
        i++
    }
}