// Desc: 생성자 선언
class Person1 {
    constructor( name: String, age: Int ) {
        println("Person의 기본 생성자 입니다.")
        this.name = name
        this.age = age
    }

    var name: String = "Default Name"
    var age: Int = 0
}

class Person2 constructor( name: String, age: Int ) {
    var name: String = name
    var age: Int = age
}

class Person3( name: String, age: Int ) {
    var name: String = name
    var age: Int = age
}

class Person4(val name: String, val age: Int )

fun main() {
    var person1: Person1 = Person1("tester1", 20)
    println(person1)

    println(person1.name)
    println(person1.age)

    var person2: Person2 = Person2("tester2", 30)
    println(person2)

    println(person2.name)
    println(person2.age)

    var person3: Person3 = Person3("tester3", 40)
    println(person3)

    println(person3.name)
    println(person3.age)

    var person4: Person4 = Person4("tester4", 50)
    println(person4)

    println(person4.name)
    println(person4.age)

}