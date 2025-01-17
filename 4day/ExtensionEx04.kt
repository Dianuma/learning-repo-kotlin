// Desc: infix 함수 예제
class MyStringCollection {
    infix fun add(s: String) { 
        println("add: $s")
     }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}

fun main() {
    var msc: MyStringCollection = MyStringCollection()
    msc.build()
}