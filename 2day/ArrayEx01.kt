fun main() {
    // var arrValue = Array(3) // [null, null, null]
    // var arrValue: Array<Int> = Array<Int>(3) // [null, null, null]
    // var arrValue: Array<Int> = Array<Int>(3) { 0 } // [0, 0, 0]
    // var arrValue: Array<Int> = Array<Int>(3) { i -> 1 } // [1, 1, 1]
    var arrValue: Array<Int> = Array<Int>(3) { i -> i } // [0, 1, 2]

    println(arrValue)
    println(arrValue.size)
    println(arrValue.contentToString())

    println(arrValue[0])
    // collection
    println(arrValue.get(0))

    arrValue[0] = 100
    println(arrValue.contentToString())
    arrValue.set(0, 200)
    println(arrValue.contentToString())

    for ( i in 0..arrValue.size - 1 ) {
        println(arrValue[i])
    }

    for ( i in arrValue.indices ) {
        println(arrValue[i])
    }

    for ( i in arrValue ) {
        println(i)
    }

    arrValue.forEach({
        println( it )
    })
}