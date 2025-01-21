package org.kotlinex.mybatisex01.mapper

import org.apache.ibatis.annotations.Mapper

@Mapper
interface MybatisMapper {
    fun select(): String
}