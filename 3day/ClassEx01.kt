// Desc: Class의 선언
class Person {
    var name: String = "Kim"
    var age: Int = 33
}

fun main() {
    var person1: Person = Person()
    println(person1)

    println(person1.name)
    println(person1.age)

    var person2: Person = Person()
    println(person2)

    println(person2.name)
    println(person2.age)
}