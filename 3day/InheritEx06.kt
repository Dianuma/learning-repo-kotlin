// Desc: 상속 클래스 간의 생성자 오버로딩
open class BasePerson() {
    open var age: Int = 0
    get() = field
    set(value) {
        field = value
    }
}

class FootballPlayer : BasePerson() {
    override var age: Int = 0
    get() = field
    set(value) {
        field = value -5
    }
}

fun main() {
    val person1 = FootballPlayer()
    person1.age = 25
    println("축구선수의 공식나이는 ${person1.age} 입니다")
}