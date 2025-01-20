package org.example.controller

import jakarta.servlet.ServletException
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model2.*
import java.io.IOException

@WebServlet(urlPatterns = ["*.do"])
class BoardController : HttpServlet() {
    @Throws(ServletException::class, IOException::class)
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        this.doProcess(req, resp)
    }

    @Throws(ServletException::class, IOException::class)
    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        this.doProcess(req, resp)
    }

    fun doProcess(req: HttpServletRequest, resp: HttpServletResponse?) {
        try {
            val path = req.servletPath

            var url = ""

            var action: Action? = null
            if (path == "/*.do" || path == "/list.do") {
                println("/list.do 호출")

                action = ListAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_list1.jsp"
            } else if (path == "/view.do") {
                println("/view.do 호출")

                action = ViewAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_view1.jsp"
            } else if (path == "/write.do") {
                println("/write.do 호출")

                action = WriteAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_write1.jsp"
            } else if (path == "/write_ok.do") {
                println("/write_ok.do 호출")

                action = WriteOkAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_write1_ok.jsp"
            } else if (path == "/modify.do") {
                println("/modify.do 호출")

                action = ModifyAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_modify1.jsp"
            } else if (path == "/modify_ok.do") {
                println("/modify_ok.do 호출")

                action = ModifyOkAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_modify1_ok.jsp"
            } else if (path == "/delete.do") {
                println("/delete.do 호출")

                action = DeleteAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_delete1.jsp"
            } else if (path == "/delete_ok.do") {
                println("/delete_ok.do 호출")

                action = DeleteOkAction()
                action.execute(req, resp)

                url = "/WEB-INF/views/board_delete1_ok.jsp"
            } else {
            }

            val dispatcher = req.getRequestDispatcher(url)
            dispatcher.forward(req, resp)
        } catch (e: ServletException) {
            println("[에러] " + e.message)
        } catch (e: IOException) {
            println("[에러] " + e.message)
        }
    }
}