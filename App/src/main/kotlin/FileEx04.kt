package org.study

import java.io.*

fun main() {
    // FileReader / FileWriter
    print("검색할 지역명을 입력하세요: ")
    var keyword: String = readLine()!!

    var fileReader: FileReader = FileReader("./zipcode_seoul_utf8_type2.csv")
    var bufferedReader: BufferedReader = BufferedReader(fileReader)

    var line: String?
    while (true) {
        line = bufferedReader.readLine()
        if (line == null) break
        if (line.contains(keyword)) {
            println(line)
        }
    }

    bufferedReader.close()
    fileReader.close()
}