fun main() {
    var intValue1: Int = 1234
    // 타입 추론
    var intValue2 = 1234

    println( intValue1 )
    println( intValue2 )

    // is
    println( intValue1 is Int )
    println( intValue2 is Long )

    var stringValue = "Test"
    println( stringValue + stringValue is String )
}