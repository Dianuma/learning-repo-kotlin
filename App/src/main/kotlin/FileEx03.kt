package org.study

import java.io.*

fun main() {
    // FileReader / FileWriter
    var fileReader: FileReader = FileReader("./info.md")
    var bufferedReader: BufferedReader = BufferedReader(fileReader)

    var line: String?
    while (true) {
        line = bufferedReader.readLine()
        if (line == null) break
        println(line)
    }

    bufferedReader.close()
    fileReader.close()
}