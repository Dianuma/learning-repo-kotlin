// Desc: 열거 클래스 예제
enum class Color( var r: Int, var g: Int, var b: Int) {
    // 상수에 대한 클래스
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    YELLOW(255, 255, 0), CYAN(0, 255, 255), MAGENTA(255, 0, 255),
    WHITE(255, 255, 255), BLACK(0, 0, 0);

    fun rgb() = "%02x".format((r * 256 + g) * 256 + b)
}

fun getColorName( color: Color ) = when (color) {
    Color.RED -> "Red"
    Color.GREEN -> "Green"
    Color.BLUE -> "Blue"
    Color.YELLOW -> "Yellow"
    Color.CYAN -> "Cyan"
    Color.MAGENTA -> "Magenta"
    Color.WHITE -> "White"
    Color.BLACK -> "Black"
}

fun main() {
    var color = Color.RED
    println(color)
    println(color.rgb())
    println(getColorName(color))
}