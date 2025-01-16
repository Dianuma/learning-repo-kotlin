fun doFunc1() {
    println("doFunc1() 호출됨")
}

fun doFunc2(): Unit {
    println("doFunc2() 호출됨")
}

fun doFunc3(a: Int, b: Int) {
    println("doFunc3() 호출됨")
}

// tailing comma
fun doFunc4(
    a: Int,
     b: Int,
     ) {
    println("doFunc4() 호출됨")
}

fun main(args: Array<String>) {
    doFunc1()
    doFunc2()
    doFunc3(10, 20)
    doFunc4(10, 20)
}