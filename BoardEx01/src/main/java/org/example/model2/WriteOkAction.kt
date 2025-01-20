package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class WriteOkAction : Action {
    override fun execute(req: HttpServletRequest, resp: HttpServletResponse?) {
        println("WriteOkAction 호출")

        val to = BoardTO()
        to.subject = req.getParameter("subject")
        to.writer = req.getParameter("writer")
        to.mail = req.getParameter("mail1") + "@" + req.getParameter("mail2")
        to.password = req.getParameter("password")
        to.content = req.getParameter("content")
        to.wip = req.remoteAddr

        val dao = BoardDAO()
        val flag = dao.boardWriteOk(to)

        req.setAttribute("flag", flag)
    }
}
