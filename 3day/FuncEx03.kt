// Desc: Function with variable number of arguments
fun sum( vararg numbers: Int) {
    println("size : $numbers.size")
    println(numbers::class.simpleName)
    for (number in numbers) {
        print(number)
    }
    println()
}

fun main() {
    sum()
    sum(1)
    sum(4, 5, 6, 7)
    sum(8, 9, 10, 11, 12)
}