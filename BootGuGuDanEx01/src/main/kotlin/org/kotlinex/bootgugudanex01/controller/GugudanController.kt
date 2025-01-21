package org.kotlinex.bootgugudanex01.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class GugudanController {

    @GetMapping("/gugudan/{dan}")
    fun gugudan(@PathVariable dan: Int, model: Model): String {
        model.addAttribute("dan", dan)
        return "gugudan"
    }
}