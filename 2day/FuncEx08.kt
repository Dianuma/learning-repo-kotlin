// 함수의 매개변수에 기본값 설정
fun doFunc( data: Int = 2 ) {
    println( "call doFunc : $data" )
}

fun main() {
    doFunc()
    doFunc( 10 )
}