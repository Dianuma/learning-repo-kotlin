// Desc: getter | setter 접근제어자
class Person() {
    var name = "Default Name"
        get() {
            println( "Call Name Get" )
            return field
        }
        set(value) {
            println( "Call Name Set" )
            field = value
        }
    var age = 0
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
    var person1: Person = Person()
    println(person1)
    
    // Get
    println(person1.name)
    println(person1.age)

    // Set
    person1.name = "John"
    person1.age = 30
    
    // Get
    println(person1.name)
    println(person1.age)
}