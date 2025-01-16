// Desc: 함수 참조를 이용한 함수 호출
fun play() {
    println( "play" )
}

fun main() {
    val pl: () -> Unit = ::play
    // val pl (): -> Unit = { println("play") }
    pl()
}