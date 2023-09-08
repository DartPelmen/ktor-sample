package com.example.plugins

import com.example.controllers.TeamController
import com.example.models.Team
import com.example.services.TeamService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.doublereceive.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    val teamController = TeamController(TeamService())
    install(DoubleReceive)
    routing {
        route("/"){
            get{
                call.parameters["id"]?.let { id->
                    teamController.get(id.toInt())?.let {
                        call.respond(HttpStatusCode.OK,
                                     teamController.get(id.toInt())!!)
                    }?:call.respond(HttpStatusCode.NoContent)
                } ?: call.respond(HttpStatusCode.OK,
                                  teamController.getAll())
            }
            post{
                val team = call.receive<Team>()
                    teamController.get(team.id)?.let {
                        call.respond(HttpStatusCode.Conflict)
                        return@post
                    }
                    teamController.add(team)
                    call.respond(HttpStatusCode.Created,"Team created")
            }
        }
    }
}
