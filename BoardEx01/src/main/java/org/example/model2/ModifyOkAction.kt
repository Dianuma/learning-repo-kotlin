package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class ModifyOkAction : Action {
    override fun execute(req: HttpServletRequest, resp: HttpServletResponse?) {
        println("ModifyOkAction 호출")

        val to = BoardTO()
        to.seq = req.getParameter("seq")
        to.subject = req.getParameter("subject")
        to.mail = req.getParameter("mail1") + "@" + req.getParameter("mail2")
        to.password = req.getParameter("password")
        to.content = req.getParameter("content")

        val dao = BoardDAO()
        val flag = dao.boardModifyOk(to)

        req.setAttribute("flag", flag)
        req.setAttribute("seq", to.seq)
    }
}
