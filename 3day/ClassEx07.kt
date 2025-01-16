// Desc: this 키워드
var highdata: String = "1234567"

fun doFunc() {
    println("Call doFunc")
}

class Student() {
    var data: String = "init data"

    fun doFunc1() {
        println("Call doFunc1 : ${data}")
        println("Call doFunc1 : ${this.data}")

        doFunc2()
        this.doFunc2()

        println( this )

        // 클래스 외부 변수
        doFunc()
        println( highdata )
    }

    fun doFunc2() {
        println("Call doFunc2")
    }
}

fun main() {
    var student: Student = Student()
    student.doFunc1()
    println( student )
}