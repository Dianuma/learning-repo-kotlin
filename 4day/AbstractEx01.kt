// Desc: 추상 클래스 예제
abstract class Animal() {
    init{
        println("Animal 생성자")
    }

    fun bark() {
        println("멍멍")
    }

    // 추상 메소드
    abstract fun move()
}

class Dog : Animal() {
    init{
        println("Dog 생성자")
    }

    override fun move() {
        println("걷기")
    }
}

fun main() {
    var a: Animal = Dog()
    a.bark()
    a.move()
}