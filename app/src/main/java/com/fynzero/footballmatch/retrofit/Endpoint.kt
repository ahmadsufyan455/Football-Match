package com.fynzero.footballmatch.retrofit

import com.fynzero.footballmatch.model.DetailResponse
import com.fynzero.footballmatch.model.LastMatchResponse
import com.fynzero.footballmatch.model.NextMatchResponse
import com.fynzero.footballmatch.model.TeamsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Endpoint {
    @GET("api/v1/json/1/eventspastleague.php")
    suspend fun getLastMatch(@Query("id") leagueId: String): Response<LastMatchResponse>

    @GET("api/v1/json/1/eventsnextleague.php")
    suspend fun getNextMatch(@Query("id") leagueId: String): Response<NextMatchResponse>

    @GET("api/v1/json/1/lookupevent.php")
    suspend fun getDetailMatch(@Query("id") eventId: String): Response<DetailResponse>

    @GET("api/v1/json/1/lookupteam.php")
    suspend fun getDetailTeam(@Query("id") teamId: String): Response<TeamsResponse>
}