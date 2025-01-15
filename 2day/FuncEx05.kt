fun main() {
    val sumOptional = { x: Int, y: Int -> x + y }
    val sumFull: (Int, Int) -> Int = { x, y -> x + y }

    println( "sumOptional : ${ sumOptional(10, 20) }" )
    println( "sumFull : ${ sumFull(10, 20) }" )
}