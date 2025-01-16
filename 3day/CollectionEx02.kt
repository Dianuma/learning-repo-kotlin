// Desc : Colleciton의 메서드
fun main() {
    var arrayList: List<Int> = arrayListOf( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 )

    arrayList.forEach{ print( "$it " ) }
    arrayList.forEach({ print( "$it " ) })
    arrayList.forEach(){ print( "$it " ) }
    arrayList.forEach{ it -> print( "$it " ) }

    println()

    arrayList.forEachIndexed{ index, it -> print( "[$index]: $it " ) }

    println()

    // 특정 조작(action) 후 출력
    println( arrayList.onEach{ it + 2 } )
    arrayList.onEach{ it + 2 }.map{ it * 2 }.forEach{ print( "$it " ) }

    // tack | takeLast | takeWhile | takeLast | drop | slice | ...
    println( arrayList.take( 3 ) ) // 앞에서 3개
    println( arrayList.takeLast( 3 ) ) // 뒤에서 3개
    println( arrayList.takeWhile{ it < 5 } ) // 5보다 작은 동안
    println( arrayList.takeLastWhile{ it > 5 } ) // 5보다 큰 동안
    println( arrayList.drop( 3 ) ) // 앞에서 3개 제외
    println( arrayList.dropLast( 3 ) ) // 뒤에서 3개 제외
    println( arrayList.slice( 1..3 ) ) // 1부터 3까지
    println( arrayList.slice( 1..3 step 2 ) ) // 1부터 3까지 2씩 증가
    println( arrayList.slice( 1..3 step 2 ).reversed() ) // 1부터 3까지 2씩 증가 후 뒤집기
}