// Desc: Copy 된 Data Class 간의 동일성 비교
data class Person( var name: String, var age: Int )

fun main() {
    val person1: Person = Person("tester1", 20)
    val person2: Person = person1.copy()
    val person3: Person = person1.copy(name="tester3")
    var person4: Person = person1.copy()

    println("person4: " + person4.hashCode())
    if ( person1.equals(person4) ) {
        println("person1 and person4 are equal")
    } else {
        println("person1 and person4 are not equal")
    }
    
    person4.name = "tester4"

    println("person1: " + person1.hashCode())
    println("person2: " + person2.hashCode())
    println("person3: " + person3.hashCode())
    println("person4: " + person4.hashCode())

    if ( person1.equals(person2) ) {
        println("person1 and person2 are equal")
    } else {
        println("person1 and person2 are not equal")
    }

    if ( person1.equals(person3) ) {
        println("person1 and person3 are equal")
    } else {
        println("person1 and person3 are not equal")
    }

    if ( person1.equals(person4) ) {
        println("person1 and person4 are equal")
    } else {
        println("person1 and person4 are not equal")
    }
}