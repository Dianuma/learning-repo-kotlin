fun func1() {
    println( "call func1" )
}

fun func2( data: Int ) {
    println( "call func2: $data" )
}

fun func3( data1: Int, data2: Int ) {
    println( "call func3: $data1, $data2" )
}

fun func4( data1: Int, data2: Int ): Int {
    print( "call func4: " )
    return data1 + data2
}

fun main() {
    func1()
    func2(100)
    func3(200, 300)
    println( func4(400, 500) )
}