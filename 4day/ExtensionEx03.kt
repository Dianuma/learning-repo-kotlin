// Desc: infix 함수 예제

// fun String.getLoggerString(x: String) : String {
//     return if( this.length > x.length ) this else x
// }

// infix 함수(표기법) : 함수를 중위 표기법으로 호출할 수 있게 해주는 함수
infix fun String.getLoggerString(x: String) : String {
    return if( this.length > x.length ) this else x
}

fun main() {
    // println("Hello".getLoggerString("Hi"))
    println("Hello" getLoggerString("Hi")) // infix 함수를 사용하면 연산자처럼 사용 가능
}