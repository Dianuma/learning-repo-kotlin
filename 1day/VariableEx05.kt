fun main() {
    var noNullableString: String = "Hello"
    var nullableString1: String? = "Hello" // ? 가 null 을 허용
    var nullableString2: String? = null // ? 가 있더라도 초기화는 필요

    // noNullableString = null
    nullableString1 = null

    println( noNullableString )
    println( nullableString1 )
    println( nullableString2 )
}