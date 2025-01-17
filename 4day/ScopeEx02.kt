// Desc: 범위 함수의 apply() 함수를 사용하여 객체의 속성을 초기화하는 예제
class Book( var title: String, var author: String, var price: Int ) {
    fun bookInfo() {
        println("Title: $title, Author: $author, Price: $price")
    }

    fun discount() {
        price -= 2000
    }
}

fun main() {
    val book1: Book = Book("Kotlin", "Adam", 10000)
    book1.discount()
    book1.bookInfo()

    val book2: Book = Book("Java", "Brian", 20000).apply {
        title = "[초특가]" + title
        discount()
    }
    book2.run{
        bookInfo()
    }

    with(book2) {
        bookInfo()
    }

    book2.let {
        it.bookInfo()
    }
}