package org.kotlinex.bootex02.controller

import org.kotlinex.bootex02.DAO.JdbcDAO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import javax.sql.DataSource

@Controller
class JdbcController {

    @Autowired
    lateinit var dataSource: DataSource

    @Autowired
    lateinit var jdbcTemplate: JdbcTemplate

    @Autowired
    lateinit var jdbcDAO: JdbcDAO

    @GetMapping("/jdbc1")
    fun jdbc1(): String {

        println("dataSource = $dataSource")

        return "jdbc1"
    }

    @GetMapping("/jdbc2")
    fun jdbc2(): String {
        println("jdbcTemplate = $jdbcTemplate")

        var result = jdbcTemplate.queryForObject("SELECT now() as now", String::class.java)
        println("result = $result")

        return "jdbc1"
    }

    @GetMapping("/jdbc3")
    fun jdbc3(): String {
        jdbcDAO.jdbc()
        return "jdbc1"
    }
}