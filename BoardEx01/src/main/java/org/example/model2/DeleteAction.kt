package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class DeleteAction : Action {
    override fun execute(req: HttpServletRequest, resp: HttpServletResponse?) {
        println("DeleteAction 호출")

        var to = BoardTO()
        to.seq = req.getParameter("seq")

        val dao = BoardDAO()
        to = dao.boardDelete(to)

        req.setAttribute("to", to)
    }
}
