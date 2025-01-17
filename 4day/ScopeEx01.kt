// Desc: 범위 함수의 apply() 함수를 사용하여 객체의 속성을 초기화하는 예제
data class Person(val name: String = "Default Name", var age: Int = 0, var city: String = "")

fun main() {
    val adam: Person = Person("Adam").apply {
        age = 20
        city = "Seoul"
    }

    println(adam)
}