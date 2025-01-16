// Desc : Colleciton의 메서드
fun main() {
    var arrayList: List<Int> = arrayListOf( 1, 2, 3, 4, 5 )
    var nullList: List<Int?> = arrayListOf( 1, null, 3, null, 5 )

    println( arrayList )

    // filter
    println( arrayList.filter{ it % 2 == 0 } )
    println( arrayList.filterNot{ it % 2 == 0 } )

    println( arrayList.filterIndexed{ index, value -> (index + value) % 3 == 0 } )

    println( nullList.filterNotNull() )

    // map
    println( arrayList.map{ it * 2 } )
    println( arrayList.mapIndexed{ index, value -> index + value } )
    println( nullList.mapNotNull{ it } )

    // 조건에 의한 검사
    // all | any | none | first | last | single | find | findLast | count | indexOf | indexOfFirst | indexOfLast | ...
    println( arrayList.all{ it < 10 } ) // 모든 요소가 10보다 작은가?
    println( arrayList.any{ it < 10 } ) // 하나라도 10보다 작은가?
    println( arrayList.none{ it < 10 } ) // 모든 요소가 10보다 큰가?
    println( arrayList.first{ it % 2 == 0 } ) // 첫번째 짝수
    println( arrayList.last{ it % 2 == 0 } ) // 마지막 짝수
    println( arrayList.single{ it == 3 } ) // 3이 하나인가?
    println( arrayList.find{ it == 3 } ) // 3을 찾아라 (첫번째로 나오는 3)
    println( arrayList.findLast{ it == 3 } ) // 3을 찾아라 (마지막으로 나오는 3)
    println( arrayList.count{ it % 2 == 0 } ) // 짝수의 개수
    println( arrayList.indexOf( 3 ) ) // 3의 인덱스
    println( arrayList.indexOfFirst{ it % 2 == 0 } ) // 첫번째 짝수의 인덱스
    println( arrayList.indexOfLast{ it % 2 == 0 } ) // 마지막 짝수의 인덱스
}