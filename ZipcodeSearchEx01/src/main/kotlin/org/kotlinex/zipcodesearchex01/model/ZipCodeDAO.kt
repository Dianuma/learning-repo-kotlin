package org.kotlinex.zipcodesearchex01.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class ZipCodeDAO {
    @Autowired
    lateinit var jdbcTemplate: JdbcTemplate

    fun selectAll(): List<ZipCodeDTO> {
        var sql = "SELECT * FROM zipcode"
        return jdbcTemplate.query(sql) { rs, rowNum ->
            ZipCodeDTO(
                rs.getString("zipcode"),
                rs.getString("sido"),
                rs.getString("gugun"),
                rs.getString("dong"),
                rs.getString("ri"),
                rs.getString("bunji"),
                rs.getInt("seq")
            )
        }
    }

    fun selectByDong(dong: String): List<ZipCodeDTO> {
        var sql = "SELECT * FROM zipcode WHERE dong like concat('%', ?, '%')"
        return jdbcTemplate.query(sql, arrayOf(dong)) { rs, rowNum ->
            ZipCodeDTO(
                rs.getString("zipcode"),
                rs.getString("sido"),
                rs.getString("gugun"),
                rs.getString("dong"),
                rs.getString("ri"),
                rs.getString("bunji"),
                rs.getInt("seq")
            )
        }
    }
}