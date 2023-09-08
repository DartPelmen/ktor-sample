package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Match(val firstTeamId: Int, val secondTeamId: Int, val gameId: Int, val score: Pair<Int, Int>)
