fun main() {
    var anyValue: Any = "Hello"

    if (anyValue is String) {
        println("String")

        // Type casting
        // as | as? | as!
        val strValue: String = anyValue as String
        println(strValue)
        
    } else {
        println("Any")
    }
}