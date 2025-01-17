// Desc: 다형성 예제
open class Drink {
    var name: String = "음료"

    open fun drink() {
        println("${name}를 마십니다")
    }
}

class Cola : Drink() {
    var type: String = "콜라"

    override fun drink() {
        println("${name}중에 ${type}을(를) 마십니다")
    }

    fun washDishes() {
        println("${type}를 설거지 합니다")
    }
}

class Cider : Drink() {
    var type: String = "사이다"

    override fun drink() {
        println("${name}중에 ${type}을(를) 마십니다")
    }

    fun washDishes() {
        println("${type}를 설거지 합니다")
    }
}

fun main() {
    var drink: Drink = Drink()
    drink.drink()

    var cola: Cola = Cola()
    cola.drink()
    cola.washDishes()

    // 다형성
    var drink2: Drink = Cola()
    var drink3: Drink = Cola()
    drink2.drink()
    // drink2.washDishes() // 오류

    // 형변환
    // if (drink2 is Cola) { // is: 타입 검사 & 형변환
    //     drink2.drink() // 실행
    //     drink2.washDishes() // 실행
    // } else {
    //     println("변경 불가")
    // }

    // if (drink3 is Cider) {
    //     drink2.drink()
    //     drink2.washDishes()
    // } else {
    //     println("변경 불가") // 실행
    // }

    var drink4 = drink2 as Cola // as: drink2, drink4 모두 형변환
    drink2.drink()
    drink2.washDishes()
    drink4.drink()
    drink4.washDishes()
}