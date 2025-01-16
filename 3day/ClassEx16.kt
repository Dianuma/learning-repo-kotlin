// Desc: Data Class의 ComponentN() 함수를 이용한 객체 분해
data class Person( val name: String, val age: Int, val gender: String )

fun main() {
    val person1 = Person("tester1", 20, "Male")
    val (name, age, gender) = person1

    println("name: $name, age: $age, gender: $gender")

    // ComponentN() 형식식
    println( person1.component1() )
    println( person1.component2() )
    println( person1.component3() )
}