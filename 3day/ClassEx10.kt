// Desc: getter | setter 접근제어자
class Person(name: String, age: Int) {
    var name = name
        get() {
            println( "Call Name Get" )
            return field
        }
        private set(value) {
            println( "Call Name Set" )
            field = value
        }
    var age = age
        get() {
            println( "Call Age Get" )
            return field
        }
        set(value) {
            println( "Call Age Set" )
            field = value
        }
}

fun main() {
    // 생성자
    var person1: Person = Person("Default Name", 0)
    println(person1)
    
    // Get
    println(person1.name)
    println(person1.age)

    // Set
    // person1.name = "John" // Error: Setter is private
    person1.age = 30
    
    // Get
    println(person1.name)
    println(person1.age)
}