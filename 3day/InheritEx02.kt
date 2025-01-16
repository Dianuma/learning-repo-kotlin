// Desc: 상속을 사용한 클래스 확장 예제
open class BasePerson(name: String, age: Int) {
    var name: String = name
    var age: Int = age
    fun talk() {
        println("이름은 $name, 나이는 $age")
    }
    fun walk() {
        println("$name 은(는) 걷는다")
    }
}

class MathTeacher(name: String, age: Int) : BasePerson(name, age) {
    fun teachMath() {
        println("$name 선생님은 수학학 과목을 가르친다")
    }
}

class FootballPlayer(name: String, age: Int) : BasePerson(name, age) {
    fun playFootball() {
        println("$name 선수는 축구를 한다")
    }
}

fun main() {
    var person1 = MathTeacher("Cane", 35)
    var person2 = FootballPlayer("Park", 28)

    person1.talk()
    person1.walk()
    person1.teachMath()

    person2.talk()
    person2.walk()
    person2.playFootball()
}