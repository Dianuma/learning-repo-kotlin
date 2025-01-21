package org.kotlinex.mybatisex01.dao

import org.kotlinex.mybatisex01.mapper.MybatisMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class MybatisDAO {

    @Autowired
    lateinit var mybatisMapper: MybatisMapper

    fun select(): String {
        return mybatisMapper.select()
    }
}