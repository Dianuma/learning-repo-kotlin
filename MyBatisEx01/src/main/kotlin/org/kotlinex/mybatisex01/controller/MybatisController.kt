package org.kotlinex.mybatisex01.controller

import org.kotlinex.mybatisex01.dao.MybatisDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MybatisController {

    @Autowired
    lateinit var mybatisDAO: MybatisDAO

    @GetMapping("/mybatis")
    fun mybatis(): String {
        println(mybatisDAO.select())
        return "mybatis"
    }
}