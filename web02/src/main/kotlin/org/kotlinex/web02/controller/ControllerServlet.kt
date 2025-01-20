package org.kotlinex.web02.controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.kotlinex.web02.model1.DeptDAO
import org.kotlinex.web02.model1.DeptTO
import org.kotlinex.web02.model1.EmpDAO
import org.kotlinex.web02.model1.EmpTO

@WebServlet("*.do")
class ControllerServlet: HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    fun doProcess(request: HttpServletRequest, response: HttpServletResponse) {
        response.characterEncoding = "utf-8"

        var path: String = request.getServletPath()

        var url: String = "/WEB-INF/views/error.jsp"
        if ( path.equals("/jdbc1.do")) {
            var dao: DeptDAO = DeptDAO()
            var lists: MutableList<DeptTO> = dao.listDepts()

            println(lists)

            url = "/WEB-INF/views/jdbc1.jsp"
        } else if ( path.equals("/jdbc2.do")) {
            var dao: EmpDAO = EmpDAO()
            var lists: MutableList<EmpTO> = dao.listEmps()

            println(lists)

            url = "/WEB-INF/views/jdbc2.jsp"
        }

        val dispatcher: RequestDispatcher = request.getRequestDispatcher(url)
        dispatcher.forward(request, response)
    }
}