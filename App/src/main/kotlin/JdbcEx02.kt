package org.study

import java.sql.*

fun main() {
    val url = "jdbc:mariadb://localhost:3306/sample"
    val user = "root"
    val password = "!123456"

    val conn = DriverManager.getConnection(url, user, password)

    var sql = "SELECT * FROM dept"
    val pstmt = conn.prepareStatement(sql)
    val rs = pstmt.executeQuery()

    while (rs.next()) {
        println("deptno: ${rs.getInt("deptno")}, dname: ${rs.getString("dname")}, loc: ${rs.getString("loc")}")
    }

    rs.close()
    pstmt.close()
    conn.close()
}