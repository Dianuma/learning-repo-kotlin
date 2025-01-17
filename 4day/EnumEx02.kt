// Desc: 열거 클래스 예제
enum class Direction {
    NORTH, SOUTH, WEST, EAST,
    // Unknown // error: 'when' expression must be exhaustive. Add the 'Unknown' branch or an 'else' branch.
}

fun getDirectionName( direction: Direction ) {
    when (direction) {
        Direction.NORTH -> println("북")
        Direction.SOUTH -> println("남")
        Direction.WEST -> println("서")
        Direction.EAST -> println("동")
    }
}

fun main() {
    getDirectionName(Direction.NORTH)
    getDirectionName(Direction.SOUTH)
    getDirectionName(Direction.WEST)
    getDirectionName(Direction.EAST)
}