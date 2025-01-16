// Desc: default parameter | named parameter
fun deleveryItem(name: String, count: Int = 1, destination: String = "집") {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}

fun main() {
    deleveryItem("짬뽕", 2, "종로구")
    deleveryItem("짜장면", 4, destination = "동대문구")
    deleveryItem("탕수육")
    deleveryItem("팔보채", destination = "서초구")
}