package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO

class ListAction : Action {
    override fun execute(req: HttpServletRequest, resp: HttpServletResponse?) {
        println("ListAction 호출")

        val dao = BoardDAO()
        val lists = dao.boardList()

        req.setAttribute("lists", lists)
    }
}
