// Desc: 인터페이스의 다중 상속
interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("먹이를 먹는다")
    }
}

class Dog : Runner, Eater {
    override fun run() {
        println("개가 달린다")
    }
    override fun eat() {
        println("개가 먹는다")
    }
}

fun main() {
    var d: Dog = Dog()
    d.run()
    d.eat()
}