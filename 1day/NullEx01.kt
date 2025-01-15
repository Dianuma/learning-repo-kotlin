fun main() {
    var stringValue1: String? = null
    var stringValue2: String = "Kotlin String"

    // null 일 경우 null 반환
    println( stringValue1?.uppercase() ) 
    println( stringValue2?.uppercase() )

    // null 일 경우 default 반환
    println( stringValue1?:"default".uppercase() ) 
    println( stringValue2?:"default".uppercase() )

    // null 일 경우 실행시 오류 발생
    println( stringValue1!!.uppercase() ) 
    println( stringValue2!!.uppercase() )
}