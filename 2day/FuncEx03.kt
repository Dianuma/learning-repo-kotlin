fun main() {
    // 함수 객체
    // 익명내부 함수
    var result1 = fun(x: Int, y: Int): Int = x + y
    var result2 = fun(x: Int, y: Int): Int {
        return x + y
    }
    println( result1 )
    println( result1(100, 200) )

    println( result2 )
    println( result2(300, 400) )
}