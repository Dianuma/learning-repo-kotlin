// Desc: Singleton Object
object Count {
    var count = 0
    fun countUp() {
        count++
    }
    fun countDown() {
        count--
    }    
    fun clear() {
        count = 0
    }
}

fun main() {
    println(Count.count)
    Count.countUp()
    Count.countUp()
    println(Count.count)
    Count.countDown()
    println(Count.count)
    Count.clear()
    println(Count.count)
}
