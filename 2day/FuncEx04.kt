// 고차함수(일급 객체)
// 함수 선언 내용을 값으로 활용

// 람다 함수( -> )
// var 변수명 = { 매개변수 -> 함수 내용 }

fun main() {
    var result1 = fun(x: Int, y: Int): Int = x + y
    var result2 = fun(x: Int, y: Int): Int {
        return x + y
    }

    println( "result1 : ${ result1(10, 20) }" )
    println( "result2 : ${ result2(10, 20) }" )
 
    // 람다 함수
    var result3 = { x: Int, y: Int -> x + y }
    println( "result3 : ${ result3(10, 20) }" )

    var result4: (Int, Int) -> Int = { x, y -> x + y }
    println( "result4 : ${ result4(10, 20) }" )

}