package org.kotlinex.web

import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@WebServlet("/servlet01")
class ServletEx01: HttpServlet() {
    // get | post
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    fun doProcess(request: HttpServletRequest, response: HttpServletResponse) {
        println("doProcess() call")

        request.setCharacterEncoding("utf-8")

        response.contentType = "text/html; charset=utf-8"
        var sbHtml: StringBuffer = StringBuffer()
        sbHtml.append("<!DOCTYPE html>")
        sbHtml.append("<html>")
        sbHtml.append("<head>")
        sbHtml.append("<meta charset='utf-8'>")
        sbHtml.append("<title>ServletEx01</title>")
        sbHtml.append("</head>")
        sbHtml.append("<body>")
        sbHtml.append("<h1>ServletEx01</h1>")
        sbHtml.append("<p>doProcess() call</p>")
        sbHtml.append("</body>")
        sbHtml.append("</html>")

        val out = response.writer
        out.println(sbHtml.toString())
        out.close()
    }
}