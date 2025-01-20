package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

class WriteAction : Action {
    override fun execute(req: HttpServletRequest, resp: HttpServletResponse?) {
        println("Write Action 호출")
    }
}
