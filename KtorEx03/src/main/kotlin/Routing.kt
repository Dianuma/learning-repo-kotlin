package com.example

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File

fun Application.configureRouting() {
    routing {
        get("/form") {
            call.respondFile(File("src/main/resources/html/form.html"))
        }

        get("/form_ok") {
            var data = call.request.queryParameters["data"]
            println( "Hello, Get : $data" )
            call.respondFile(File("src/main/resources/html/form_ok.html"))
        }

        get("/form_ok/{data}") {
            var data = call.parameters["data"]
            println( "Hello, Get : $data" )
            call.respondFile(File("src/main/resources/html/form_ok.html"))
        }

        post("/form_ok") {
            var formContent: Parameters = call.receiveParameters()
            println( "Hello, Post : $formContent | ${formContent["data"]}" )
            call.respondFile(File("src/main/resources/html/form_ok.html"))
        }
    }
}
