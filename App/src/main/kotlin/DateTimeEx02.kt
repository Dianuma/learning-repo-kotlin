package org.study

import kotlinx.datetime.*


fun main() {
    val currDateTime = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    val currDateTime2 = Clock.System.now()
    val date = LocalDate(2021, 3, 27)
    val time = LocalTime(2, 16, 20)
    val dateTime = LocalDateTime(date, time)
    println(currDateTime::class)
    println(currDateTime2::class)
    println(date)
    println(time)
    println(dateTime)
}