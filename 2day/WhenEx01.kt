fun main() {
    val score: Int = 80

    var grade: String = when {
        score >= 90 -> "A"
        score in 80..89 -> "B"
        score in 70..79 -> "C"
        score in 60..69 -> "D"
        else -> "F"
    }

    println(grade)
}