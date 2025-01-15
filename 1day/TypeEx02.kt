fun main() {
    val byteValue: Byte = 127
    val shortValue: Short = 32767
    val intValue: Int = 2147483647
    val longValue: Long = 9223372036854775807L
    val floatValue: Float = 3.14F
    val doubleValue: Double = 3.141592653589793

    val uByteValue: UByte = 255u
    val uIntValue: UInt = 4294967295u

    println( byteValue )
    println( shortValue )
    println( intValue )
    println( longValue )
    println( floatValue )
    println( doubleValue )
    println( uByteValue )
    println( uIntValue )

    val value1 = 2147483647
    val value2 = 9223372036854775807L
    // val value2: Int = 223372036854775807L : 오류. 타입 추론을 하는 편이 더 좋은 경우도 많음.
    println( value1 )
    println( value2 )

    println( value1 :: class.simpleName )
    println( value2 :: class.simpleName )
}