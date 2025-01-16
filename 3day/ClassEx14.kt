// Desc: Data Class
class Person1( val name: String, val age: Int )
data class Person2( val name: String, val age: Int )

fun main() {
    var person1: Person1 = Person1("tester1", 20)

    println(person1)
    println(person1.name)
    println(person1.age)

    var person2: Person2 = Person2("tester2", 30)
    println(person2)
    println(person2.name)
    println(person2.age)

    var person3: Person2 = person2.copy(name="tester3")
    println(person3)
    println(person3.name)
    println(person3.age)
}