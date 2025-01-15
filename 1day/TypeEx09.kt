fun main() {
    var stringValue: String = "Hello Kotlin String Hello Kotlin String"

    // indexOf | lastIndexOf
    println( stringValue.indexOf( "Ko" ))
    println( stringValue.lastIndexOf( "Ko" ))
    println( stringValue.indexOf( "Ko", 7 )) // 7번째부터 찾기
    
    println( stringValue.indexOf( "Ro" ))
    println( stringValue.lastIndexOf( "Ro" ))

    // startsWith | endsWith | contains
    println( stringValue.startsWith( "He" ) )
    println( stringValue.startsWith( "HE" ) )

    println( stringValue.endsWith( "ng" ) )
    println( stringValue.endsWith( "NG" ) )

    println( stringValue.contains( "Kotlin" ) )
    println( stringValue.contains( "KOTLIN" ) )

    var replaceValue: String = stringValue.replace( "Kotlin", "Java" )
    println( replaceValue )

    var formatValue: String = String.format( "Hello %s", "Kotlin" )
    println( formatValue )

    var trimValue: String = "  Hello Kotlin String  "
    println( trimValue.trim() )
}