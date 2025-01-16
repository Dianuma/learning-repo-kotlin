// Desc: 생성자 오버로딩
class Person(val name: String = "Default Name", val age: Int = 0)

fun main() {
    var person1: Person = Person("tester1", 20)
    println(person1)
    println(person1.name)
    println(person1.age)

    var person2: Person = Person()
    println(person2)
    println(person2.name)
    println(person2.age)

    var person3: Person = Person("tester3")
    println(person3)
    println(person3.name)
    println(person3.age)

    var person4: Person = Person(age = 40)
    println(person4)
    println(person4.name)
    println(person4.age)

}