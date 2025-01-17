// Desc: 중첩 클래스 예제
class Outer() {
    var text: String = "Outer Class"

    class Nested() {
        fun introduce() {
            // println(text) // Error: 외부 클래스의 프로퍼티에 접근 불가
            println("Nested Class")
        }
    }
}

fun main() {
    var outer = Outer()
    var nested = Outer.Nested()

    println(outer.text)
    nested.introduce()
}