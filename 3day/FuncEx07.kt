// Desc: 고차 함수를 이용한 함수 호출
fun manipulateTwoThree(a: Int, b: Int) {
    println("${a} / ${b} = ${a / b}")
}

fun manipulateTwoThree(func: (Int, Int) -> Int) {
    println( func(2,3) )
}

fun main() {
    manipulateTwoThree(2, 3)
    manipulateTwoThree({ a, b -> a * b })
    manipulateTwoThree({ a, b -> a - b })
    manipulateTwoThree({ a, b -> a + b })
    manipulateTwoThree({ a, b -> a / b })
}