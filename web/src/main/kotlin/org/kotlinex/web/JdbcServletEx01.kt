package org.kotlinex.web

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.sql.Connection
import javax.naming.Context
import javax.naming.InitialContext
import javax.sql.DataSource

@WebServlet("/jdbc")
class JdbcServletEx01: HttpServlet() {
    // get | post
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    fun doProcess(request: HttpServletRequest, response: HttpServletResponse) {
        response.characterEncoding = "utf-8"

        lateinit var conn: Connection
        var initCtx: Context = InitialContext()
        var envCtx: Context = initCtx.lookup("java:comp/env") as Context
        var dataSource: DataSource = envCtx.lookup("jdbc/mariadb") as DataSource

        conn = dataSource.getConnection()

        println("conn: $conn")

        val sql: String = "SELECT version()"
        val pstmt = conn.prepareStatement(sql)
        val rs = pstmt.executeQuery()

        while (rs.next()) {
            println("version: ${rs.getString(1)}")
        }

        rs.close()
        pstmt.close()
        conn.close()
    }
}