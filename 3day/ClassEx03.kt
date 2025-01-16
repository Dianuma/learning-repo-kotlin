// Desc: 생성자 오버로딩
class Person {
    constructor() {
        println("Person의 기본 생성자 입니다.")
    }

    constructor( name: String ) {
        println("Person의 기본 생성자 입니다.")
        this.name = name
    }

    constructor( age: Int ) {
        println("Person의 기본 생성자 입니다.")
        this.age = age
    }

    constructor( name: String, age: Int ) {
        println("Person의 기본 생성자 입니다.")
        this.name = name
        this.age = age
    }

    var name: String = "Default Name"
    var age: Int = 0
}

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

    var person4: Person = Person(40)
    println(person4)
    println(person4.name)
    println(person4.age)

}