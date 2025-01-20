package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class DeleteOkAction : Action {
    override fun execute(req: HttpServletRequest, resp: HttpServletResponse?) {
        println("DeleteOkAction 호출")

        val to = BoardTO()
        to.seq = req.getParameter("seq")
        to.password = req.getParameter("password")

        val dao = BoardDAO()
        val flag = dao.boardDeleteOk(to)

        req.setAttribute("flag", flag)
    }
}
