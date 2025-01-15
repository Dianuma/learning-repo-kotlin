fun main() {
    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)
    println( mutableList )

    mutableList.shuffle() // shuffle the list elements randomly
    println( mutableList )

    mutableList.sort() // sort the list elements in ascending order
    println( mutableList )

    mutableList.sortDescending() // sort the list elements in descending order
    println( mutableList )

    var sortedList = mutableList.sorted() // sort the list elements in ascending order and return a new list
    println( sortedList )

    sortedList.reversed() // reverse the list elements
    println( sortedList )
}