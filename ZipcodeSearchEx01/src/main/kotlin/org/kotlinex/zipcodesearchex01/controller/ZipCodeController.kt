package org.kotlinex.zipcodesearchex01.controller

import org.kotlinex.zipcodesearchex01.model.ZipCodeDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class ZipCodeController {

    @Autowired
    lateinit var zipCodeDAO: ZipCodeDAO

    @GetMapping("/zip")
    fun searchAll(model: Model): String {
        var list = zipCodeDAO.selectAll()
        model.addAttribute("list", list)
        return "zipcode"
    }

    @GetMapping("/zip/{dong}")
    fun searchByDong(@PathVariable dong: String, model: Model): String {
        var list = zipCodeDAO.selectByDong(dong)
        model.addAttribute("list", list)
        return "zipcode"
    }

}