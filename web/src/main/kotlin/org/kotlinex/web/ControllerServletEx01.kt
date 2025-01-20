package org.kotlinex.web

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

// /view/path
@WebServlet("/controller")
class ControllerServletEx01: HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    fun doProcess(request: HttpServletRequest, response: HttpServletResponse) {
        response.characterEncoding = "utf-8"
        response.contentType = "text/html; charset=utf-8"

        var path: String = request.getParameter("path")

        var url: String = "/WEB-INF/views/error.jsp"

        if ( path == "" || path.equals("view1") ) {
            url = "/WEB-INF/views/view1.jsp"
        } else if ( path.equals("view2") ) {
            url = "/WEB-INF/views/view2.jsp"
        } else if ( path.equals("gugudan") ) {
            url = "/WEB-INF/views/gugudan.jsp"
        } else if ( path.equals("gugudan_ok") ) {
            url = "/WEB-INF/views/gugudanOk.jsp"
        }

        val dispatcher: RequestDispatcher = request.getRequestDispatcher(url)
        dispatcher.forward(request, response)
    }
}