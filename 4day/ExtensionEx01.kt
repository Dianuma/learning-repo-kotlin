// Desc: 확장 함수 예제
class Car {
    fun getPrice(): Int {
        return 1000
    }
}

// getBrandName 함수를 Car 클래스에 확장함
fun Car.getBrandName(): String {
    return "BMW"
}

fun main() {
    var c: Car = Car()
    println(c.getPrice())
    println(c.getBrandName())
}