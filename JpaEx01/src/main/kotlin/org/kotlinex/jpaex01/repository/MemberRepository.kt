package org.kotlinex.jpaex01.repository

import org.kotlinex.jpaex01.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository: JpaRepository<Member, String> {

}