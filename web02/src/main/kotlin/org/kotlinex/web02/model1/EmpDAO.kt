package org.kotlinex.web02.model1

import java.sql.Connection
import javax.naming.Context
import javax.naming.InitialContext
import javax.sql.DataSource

class EmpDAO {
    lateinit var dataSource: DataSource

    constructor() {
        val initCtx = InitialContext()
        val envCtx = initCtx.lookup("java:comp/env") as Context
        this.dataSource = envCtx.lookup("jdbc/mariadb") as DataSource
    }

    fun listEmps(): MutableList<EmpTO> {
        var lists: MutableList<EmpTO> = mutableListOf()

        val conn: Connection = this.dataSource.getConnection()
        println(conn)

        val sql: String = "SELECT * FROM emp"
        val pstmt = conn.prepareStatement(sql)

        val rs = pstmt.executeQuery()

        while (rs.next()) {
            val empno: String? = rs.getString("empno")
            val ename: String? = rs.getString("ename")
            val job: String? = rs.getString("job")
            val mgr: String? = rs.getString("mgr")
            val hiredate: String? = rs.getString("hiredate")
            val sal: String? = rs.getString("sal")
            val comm: String? = rs.getString("comm")
            val deptno: String? = rs.getString("deptno")

            var to = EmpTO( empno, ename, job, mgr, hiredate, sal, comm, deptno )
            lists.add(to)
        }

        rs.close()
        pstmt.close()
        conn.close()

        return lists
    }
}