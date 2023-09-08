package com.example.services

import com.example.models.Match

class MatchService(matches: MutableList<Match> = mutableListOf()):
        CRUDService<Match>(matches){
    override fun add(entity: Match) {
        TODO("Not yet implemented")
    }

    override fun update(id: Int, entity: Match) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }

    override fun read(id: Int): Match? {
        TODO("Not yet implemented")
    }

    override fun readAll(): List<Match> {
        TODO("Not yet implemented")
    }

}