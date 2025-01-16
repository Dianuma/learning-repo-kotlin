// Desc: 상속 클래스 간의 인자 갯수 불일치
open class BasePerson(name: String, age: Int, club: String) {
    var name: String = name
    var age: Int = age
    var club: String = club
    fun talk() {
        println("$club 소속, 이름은 $name, 나이는 $age")
    }
    fun walk() {
        println("$name 은(는) 걷는다")
    }
}
class FootballPlayer(name: String, age: Int) : BasePerson(name, age, "Manchester United") {
    init {
        println("$name 선수는 $club 소속이다")
    }

    fun playFootball() {
        println("$name 선수는 축구를 한다")
    }
}

fun main() {
    val person1 = FootballPlayer("Park", 28)
    person1.talk()
    person1.walk()
    person1.playFootball()
}