fun main() {
    println("Start")

    // for (i in 1..9) {
    // for (i in 1..9 step 2) {
    // for (i in 9..1) { // No output
    // for (i in 9 downTo 1 step 2) {
    for (i in 1 until 9) {
        println("i: $i")
    }

    println("End")
}