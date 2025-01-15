fun main() {
    var intValue: Int = 10

    if ( intValue > 0 ) {
        println( "$intValue is positive number" )
    } else if ( intValue == 0 ) {
        println( "$intValue is zero" )
    } else {
        println( "$intValue is negative number" )
    }

    intValue = -10

    if ( intValue > 0 ) {
        println( "$intValue is positive number" )
    } else if ( intValue == 0 ) {
        println( "$intValue is zero" )
    } else {
        println( "$intValue is negative number" )
    }

    intValue = 0
    
    if ( intValue > 0 ) {
        println( "$intValue is positive number" )
    } else if ( intValue == 0 ) {
        println( "$intValue is zero" )
    } else {
        println( "$intValue is negative number" )
    }
}