fun main() {
    var stringValue: StringBuilder = StringBuilder( "Hello Kotlin String" )
    println( stringValue )

    stringValue.append( " 123" )
    stringValue.append( " 456" )
    println( stringValue )

    stringValue.insert( 0, "String " )
    println( stringValue )

    stringValue.delete( 0, 7 )
    println( stringValue )

    stringValue.deleteCharAt( 0 )
    println( stringValue )
}