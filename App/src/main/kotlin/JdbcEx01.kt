package org.study

import java.sql.*

fun main() {
    var url: String = "jdbc:mariadb://localhost:3306/"
    var user: String = "root"
    var password: String = "!123456"

    // Connection 객체 생성 | PrepareStatement 객체 생성 | ResultSet 객체 생성
    lateinit var conn: Connection
    lateinit var pstmt: PreparedStatement
    lateinit var rs: ResultSet

//    try ~ catch ~ finally 구문이 필수가 아님
    Class.forName("org.mariadb.jdbc.Driver")
    conn = DriverManager.getConnection(url, user, password)
    println("conn: $conn")

    var sql: String = "SELECT version()"
    pstmt = conn.prepareStatement(sql)
    rs = pstmt.executeQuery()

    if (rs.next()) {
        println("DB Version: ${rs.getString(1)}")
    }

    rs.close()
    pstmt.close()
    conn.close()

//    try {
//        Class.forName("org.mariadb.jdbc.Driver")
//        conn = java.sql.DriverManager.getConnection(url, user, password)
//        println("conn: $conn")
//    } catch (e: Exception) {
//        println("Error: ${e.message}")
//    } finally {
//        rs.close()
//        pstmt.close()
//        conn.close()
//    }
}