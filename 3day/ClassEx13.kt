// Desc: Companion Object (동반자 객체)
class FoodPoll( val name: String ) {
    companion object {
        var total: Int = 0
    }

    var count: Int = 0

    fun vote() {
        total++
        count++
    }
}

fun main() {
    val a: FoodPoll = FoodPoll("짜장")
    val b: FoodPoll = FoodPoll("짬뽕")

    a.vote()
    a.vote()
    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("Total : ${FoodPoll.total}")
}
