package org.kotlinex.jpaex01.controller

import org.kotlinex.jpaex01.entity.Member
import org.kotlinex.jpaex01.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class controller {

    @Autowired
    lateinit var memberRepository: MemberRepository

    @RequestMapping("/select")
    fun select(): String {
        println( memberRepository.count() )
        memberRepository.findAll().forEach(::println)
        return "select"
    }

    @RequestMapping("/insert")
    fun insert(): String {
        var member1: Member = Member("id01", "name1", "1", "password", "email1@mail.com")
        var member2: Member = Member("id02", "name2", "1", "password", "email2@mail.com")
        memberRepository.save(member1)
        memberRepository.save(member2)
        return "insert"
    }
}