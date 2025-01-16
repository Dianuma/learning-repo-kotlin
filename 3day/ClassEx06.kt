// Desc: 멤버 함수
class Student() {
    fun doFunc1() {
        // 지역 변수
        var data: Int = 10
        println("Call doFunc1 : ${data}")
    }

    fun doFunc2( data1: Int ) {
        println("Call doFunc2 : ${data1}")
    }

    fun doFunc3( data1: Int, data2: String ) {
        println("Call doFunc3 : ${data1}, ${data2}")
    }
}

fun main() {
    var student: Student = Student()
    student.doFunc1()
    student.doFunc2(20)
    student.doFunc3(30, "tester")
}