package org.kotlinex.jpaex01.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Member (
    @Id
    var id: String = "",
    @Column( name = "name" )
    var name: String = "",
    var type: String = "",
    var password: String = "",
    var email: String = ""
)