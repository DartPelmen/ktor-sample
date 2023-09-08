package com.example.controllers

import com.example.models.Team
import com.example.services.TeamService


class TeamController(teamService: TeamService): Controller<Team>(teamService) {
    override fun getAll(): List<Team> = service.readAll()

    override fun get(id: Int): Team? = service.read(id)

    override fun delete(id: Int) = service.delete(id)

    override fun update(id: Int, entity: Team) = service.update(id, entity)

    override fun add(entity: Team) = service.add(entity)
}