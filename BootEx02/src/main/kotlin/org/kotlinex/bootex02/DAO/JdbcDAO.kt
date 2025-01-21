package org.kotlinex.bootex02.DAO

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class JdbcDAO {
    @Autowired
    lateinit var jdbcTemplate: JdbcTemplate

    fun jdbc() {
        println( "jdbcTemplate = $jdbcTemplate" )

        var result = jdbcTemplate.queryForObject("SELECT now() as now", String::class.java)
        println("result = $result")
    }
}