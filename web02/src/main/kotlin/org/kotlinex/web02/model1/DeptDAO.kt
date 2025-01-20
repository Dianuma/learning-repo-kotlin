package org.kotlinex.web02.model1

import java.sql.Connection
import javax.sql.DataSource
import javax.naming.InitialContext
import javax.naming.Context

class DeptDAO {
    lateinit var dataSource: DataSource

    constructor() {
        val initCtx = InitialContext()
        val envCtx = initCtx.lookup("java:comp/env") as Context
        this.dataSource = envCtx.lookup("jdbc/mariadb") as DataSource
    }

    fun listDepts(): MutableList<DeptTO> {
        var lists: MutableList<DeptTO> = mutableListOf()

        val conn: Connection = this.dataSource.getConnection()
        println(conn)

        val sql: String = "SELECT * FROM dept"
        val pstmt = conn.prepareStatement(sql)

        val rs = pstmt.executeQuery()

        while (rs.next()) {
            val deptno: String = rs.getString("deptno")
            val dname: String = rs.getString("dname")
            val loc: String = rs.getString("loc")

            var to = DeptTO( deptno, dname, loc )
            lists.add(to)
        }

        rs.close()
        pstmt.close()
        conn.close()

        return lists
    }
}