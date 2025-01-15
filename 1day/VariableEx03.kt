var data1: Int = 1234
val data2: Int = 1234

// 상수
const val data3:Int = 1234

fun main() {
    var data4: Int = 1234
    val data5: Int = 1234

    // 로컬에서는 상수 선언 불가
    // const val data12:Int = 1234

    println( data1 )
    println( data2 )
    println( data3 )
    println( data4 )
    println( data5 )

    // 재선언 가능
    var data1: Int = 2345
    val data2: Int = 2345
    println( data1 )
    println( data2 )
}

// 밖에서는 println 불가
// println( data1 )
// println( data2 )