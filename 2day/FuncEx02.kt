// 익명 함수

fun func1() = println("func1() 호출")
fun func2( data: Int ) = println( "call func2: $data" )
fun func3( data1: Int, data2: Int ) = println( "call func3: $data1, $data2" )
fun func4( data1: Int, data2: Int ) = data1 + data2

fun main() {
    func1()
    func2(100)
    func3(200, 300)
    println( func4(400, 500) )
}