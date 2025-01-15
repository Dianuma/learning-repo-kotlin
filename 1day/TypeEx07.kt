fun main() {
    var stringValue1: String = "Hello Kotlin"
    var stringValue2: String = """Hello
    Kotlin"""

    println( stringValue1 )
    println( stringValue2 )

    var stringBuffer: StringBuffer = StringBuffer("Hello Kotlin")
    println( stringBuffer )

    var stringBuilder: StringBuilder = StringBuilder("Hello Kotlin")
    println( stringBuilder )
}