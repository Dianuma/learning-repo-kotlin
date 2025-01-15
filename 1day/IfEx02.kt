fun main() {
    print( "점수를 입력하세요 : " )
    var point: Int = readln().toInt()


    if ( point >= 90  ) {
        println( "A" )
    } else if ( point >= 80 ) {
        println( "B" )
    } else if ( point >= 70 ) {
        println( "C" )
    } else if ( point >= 60 ) {
        println( "D" )
    } else {
        println( "F" )
    }
}