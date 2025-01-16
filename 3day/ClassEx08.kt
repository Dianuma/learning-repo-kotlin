// Desc: Init Block
class Person(val name: String = "Default Name", val age: Int = 0) {
    init {
        println("Person init")
    }
}

fun main() {
    var person1: Person = Person()
    println(person1)
    println(person1.name)
    println(person1.age)
}