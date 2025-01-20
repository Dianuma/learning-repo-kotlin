package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

interface Action {
    fun execute(req: HttpServletRequest, resp: HttpServletResponse?)
}
