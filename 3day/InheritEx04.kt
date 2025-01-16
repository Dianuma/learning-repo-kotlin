// Desc: 상속 클래스 간의 생성자 오버로딩
open class BasePerson {
    var name: String = "Default Name"
    var age: Int = 0

    constructor(name: String) {
        this.name = name
        println("Person name: $name")
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("Person name: $name, age: $age")
    }
}

class FootballPlayer : BasePerson {
    constructor(name: String) : super(name)
    constructor(name: String, age: Int) : super(name, age)

    fun playFootball() {
        println("$age 살, $name 선수는 축구를 한다")
    }
}

fun main() {
    val person1 = FootballPlayer("Kim")
    val person2 = FootballPlayer("Park", 28)
    person1.playFootball()
    person2.playFootball()
}