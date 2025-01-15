fun main() {
    var stringValue: StringBuilder = StringBuilder( "Hello Kotlin String" )
    
    stringValue.reverse();
    println( stringValue )
    stringValue.reverse();

    println( stringValue.substring( 0 .. 4 ) )
    println( stringValue[0] )
    println( stringValue[4] )

    var tempValue: String = stringValue.toString()
    println( tempValue )
}