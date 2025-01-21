package org.kotlinex.bootex01.controller

import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.ModelAndView

@Controller
// @RestController
class HomeController {

//    @GetMappingz()
//    @PostMapping
    @RequestMapping("")
    fun index(): String {
        return "index"
    }

//    HTTPServletRequest | @RequestParam | @ModelAttribute | @PathVariable
    @GetMapping("/get1")
    fun get1(request: HttpServletRequest): String {
        println("request = ${request.getParameter("data")}")
        return "index"
    }

    @GetMapping("/get2")
    fun get2(@RequestParam( name = "data" ) data: String): String {
        println("request = $data")
        return "index"
    }

    @GetMapping("/get3")
    fun get3(data: String): String {
        println("request = $data")
        return "index"
    }

    @GetMapping("/get4/{data}")
    fun get5(@PathVariable data: String): String {
        println("request = $data")
        return "index"
    }

//    HTTPServletRequest | Model | ModelAndView
    @GetMapping("/set1")
    fun set1(request: HttpServletRequest): String {
        request.setAttribute("data", "Hello, World!")
        return "index"
    }

    @GetMapping("/set2")
    fun set2(model: Model): String {
        model.addAttribute("data", "Hello, World!")
        return "index"
    }

    @GetMapping("/set3")
    fun set3(): ModelAndView {
        val mv = ModelAndView()
        mv.addObject("data", "Hello, World!")
        mv.viewName = "index"
        return mv
    }
}