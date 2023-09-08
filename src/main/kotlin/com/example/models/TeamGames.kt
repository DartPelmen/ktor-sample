package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class TeamGames(val teamId: Int, val gameId: Int)
