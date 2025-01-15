fun main() {
    var a: Int = 10000
    var boxedA: Int = a
    var anotherBoxedA: Int = a

    // 구형
    // 저장값이 작은 수 = 기본형 .. 변형
    // ? : null = 객체 형태
    
    // Java : 기본자료형(객체 X) / wrapper(O)

    println( a )
    println( boxedA )
    println( anotherBoxedA )

    // == : 값을 비교 (equals)
    // === : 주소를 비교
    println( boxedA == anotherBoxedA )
    println( boxedA === anotherBoxedA )
}