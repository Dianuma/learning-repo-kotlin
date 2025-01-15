fun main() {
    var stringValue1: StringBuilder = StringBuilder()
    var stringValue2: StringBuilder = StringBuilder( "Hello Kotlin String" )
    var stringValue3: StringBuilder = StringBuilder( 100 )

    println( stringValue1 )
    println( stringValue2 )
    println( stringValue3 )

    // 내부에 저장된 문자열의 길이
    println( stringValue1.length )
    println( stringValue2.length )
    println( stringValue3.length )

    // 내부에 저장된 문자열의 용량
    println( stringValue1.capacity() )
    println( stringValue2.capacity() )
    println( stringValue3.capacity() )
}