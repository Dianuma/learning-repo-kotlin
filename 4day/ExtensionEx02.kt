// Desc: 기존 클래스에 확장 함수 추가
// 확장 함수
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // this는 MutableList<Int> 객체를 가리킴
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main() {
    var list: MutableList<Int> = mutableListOf(1, 2, 3)
    println(list)

    // swap 함수를 MutableList 클래스에 확장함
    list.swap(0, 2)

    println(list)
}