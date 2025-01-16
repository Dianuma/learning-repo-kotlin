// MutableList를 이용한 정렬 함수
fun customsort(arr: MutableList<Int>) {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j+1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    println("Sorted array: $arr")
}

// vararg를 이용한 정렬 함수
fun customsort(vararg arr: Int) {
    var tmp: Int = 0
    for ( i in arr ) {
        for ( j in 0 until arr.size - 1 ) {
            if ( arr[j] > arr[j+1] ) {
                tmp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = tmp
            }
        }
    }
    println("Sorted array: ${arr.toList()}")
}

fun main() {
    val arr = mutableListOf(64, 34, 25, 12, 22, 11, 90)
    println("Original array: $arr")
    customsort(arr)
    customsort(64, 34, 25, 12, 22, 11, 90)
}