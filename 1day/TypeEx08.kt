fun main() {
    var stringValue: String = "Hello Kotlin String"
    var stringValue1: String = "Hello/Kotlin String"

    println( stringValue )

    println( "문자열의 길이 : ${ stringValue.length }" )

    // 문자열의 분리 : substring
    println( stringValue.substring( 5 ))
    // 범위
    println( stringValue.substring( 5, 9 ))
    // 범위 연산자 : until
    println( stringValue.substring( 5 until 9 ))
    // 범위 연산자 : ..
    println( stringValue.substring( 5 .. 9 ))

    // 문자열의 분리 : split
    var splitValue1 = stringValue.split( " " )
    println( splitValue1 )
    var splitValue2 = stringValue.split( " ", limit = 2 )
    println( splitValue2 )
    var splitValue3 = stringValue1.split( " ", "/" )
    println( splitValue3 )

    // 글자갯수 중심의 문자열 분리
    var chunkedValue1 = stringValue.chunked( 3 );
    println( chunkedValue1 )
    var chunkedValue2 = stringValue.chunked( 5 );
    println( chunkedValue2 )

    // 대소문자
    println( stringValue.lowercase() )
    println( stringValue.uppercase() )
}