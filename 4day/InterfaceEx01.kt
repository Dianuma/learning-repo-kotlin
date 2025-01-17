// Desc: 인터페이스 예제
interface Person1 {
    abstract fun needToSleep()
    open fun getName(): String {
        return "사람"
    }
}

// 인터페이스에서 abstract, open 생략 가능
interface Person2 {
    fun needToSleep()
    fun getName(): String {
        return "사람"
    }
}

class Student1 : Person1 {
    override fun needToSleep() {
        println("학생은 잠이 필요해")
    }
    // override fun getName(): String {
    //     return "학생"
    // }
}

class Student2 : Person2 {
    override fun needToSleep() {
        println("학생은 잠이 필요해")
    }
    override fun getName(): String {
        return "학생"
    }
}

fun main() {
    var s1: Student1 = Student1()
    s1.needToSleep()
    println(s1.getName())

    var s2: Student2 = Student2()
    s2.needToSleep()
    println(s2.getName())
}