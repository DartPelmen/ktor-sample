package com.example.services

import com.example.models.Team

class TeamService(teams: MutableList<Team>): CRUDService<Team>(teams) {
    
    init {
        for(i in 1 .. 100){
            list.add(Team(i,"test $i"))
        }
    }

    override fun add(entity: Team){
        list.add(entity)
    }

    override fun readAll(): List<Team> = list

    override fun read(id: Int) = list.find { it.id == id }

    override fun update(id: Int, entity: Team){
        if(list.any { it.id == id }){
            val index = list.indexOfFirst {
                it.id == id
            }
            list[index] = entity
        }
    }

    override fun delete(id: Int){
        if(list.any { it.id == id }){
            list.removeIf { it.id == id }
        }
    }
}