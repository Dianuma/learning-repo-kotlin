package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.Thymeleaf
import io.ktor.server.thymeleaf.ThymeleafContent
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun Application.configureTemplating() {
    install(Thymeleaf) {
        setTemplateResolver(ClassLoaderTemplateResolver().apply {
            prefix = "templates/thymeleaf/"
            suffix = ".html"
            characterEncoding = "utf-8"
        })
    }
    routing {
        get("/html-thymeleaf") {
            call.respond(ThymeleafContent("index", mapOf("user" to ThymeleafUser(1, "user1"))))
        }

        get( "/form") {
            call.respond(ThymeleafContent("form", mapOf("msg" to "Hello, Thymeleaf!")))
        }

        get( "/form_ok" ) {
            call.respond(ThymeleafContent("form_ok", mapOf("msg" to "Hello, Thymeleaf!")))
        }
    }
}

data class ThymeleafUser(val id: Int, val name: String)
