// Desc: 내부 클래스 예제
class Outer() {
    var text: String = "Outer Class"

    inner class Inner() {
        fun introduce() {
            // println(text) // Error: 외부 클래스의 프로퍼티에 접근 불가
            println("Inner Class")
        }
    }
}

fun main() {
    var outer = Outer()
    var outerInner = outer.Inner()

    println(outer.text)
    outerInner.introduce()
    outer.Inner().introduce()
}