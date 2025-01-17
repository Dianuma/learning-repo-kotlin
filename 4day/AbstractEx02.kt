// Desc: 추상 클래스를 상속받아서 구현하는 예제
open class Person {
    init {
        println("Person 생성자")
    }

    open fun needToSleep() {
        println("사람은 잠이 필요해")
    }
}

abstract class Student : Person() {
    init {
        println("Student 생성자")
    }
    override abstract fun needToSleep()
}

class HighShcoolStudent : Student() {
    init {
        println("HighShcoolStudent 생성자")
    }

    override fun needToSleep() {
        println("고등학생은 잠이 필요해")
    }
}

fun main() {
    var p: Person = Person()
    p.needToSleep()

    var s: HighShcoolStudent = HighShcoolStudent()
    s.needToSleep()
}