// Desc: 상속 클래스 간의 생성자 오버로딩
open class BasePerson() {
    open fun speakAge( age: Int ) {
        println("나이는 $age 입니다")
    }
}

class FootballPlayer : BasePerson() {
    override fun speakAge( age: Int ) {
        println("축구선수의 공식나이는 ${age-5} 입니다")
    }
}

fun main() {
    val person1 = FootballPlayer()
    person1.speakAge(28)
}