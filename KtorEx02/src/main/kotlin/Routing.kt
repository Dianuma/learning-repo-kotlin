package com.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/test1") {
//            call.respondText("Test1")
            var html = "<h1>Hello World!</h1>"
            var type = ContentType.parse("text/html")
            call.respondText(html, type)
        }
    }
}
