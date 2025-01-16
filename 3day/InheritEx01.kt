// Desc: 상속 관계에서의 초기화 블럭 실행 순서
open class Animal() {
    init {
        println("Animal 생성자")
    }
}

open class Dog() : Animal() {
    init {
        println("Dog 생성자")
    }
}

class Jindo() : Dog() {
    init {
        println("Jindo 생성자")
    }
}

fun main() {
    var a: Animal = Animal()
    var d: Dog = Dog()
    var j: Jindo = Jindo()
}