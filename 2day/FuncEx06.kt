fun sub( str: String ) {
    println( "call sub : $str" )
}

fun func( func: (String) -> Unit ) {
    func( "call func" )
}

fun main() {
    // sub( "Hello" )
    func( ::sub ) // call sub : call func
}