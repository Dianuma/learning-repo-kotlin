fun main() {
    // 다차원 배열
    // var arrValue:Array<Array<Int>> = Array<Array<Int>>(3){ Array<Int>(3){0} }
    var arrValue:Array<Array<Int>> = arrayOf( 
        arrayOf(1, 2, 3), 
        arrayOf(4, 5, 6), 
        arrayOf(7, 8, 9) 
        )

    println( arrValue.contentToString() )
    println( arrValue[0].contentToString() )
    println( arrValue[2].contentToString() )
    println( arrValue.contentDeepToString() )

    for ( i in arrValue ) {
        println( i.contentToString() )
    }
}