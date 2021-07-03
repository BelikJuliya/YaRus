package android.example.yarus.view.data.rest

import android.example.yarus.view.domain.entities.Character
import android.example.yarus.view.domain.entities.Episode
import android.example.yarus.view.domain.entities.Location
import retrofit2.http.GET

interface ApiService {

//    @GET("character")
//    suspend fun getCharacters(): Car

    @GET("location")
    suspend fun getLocations(): List<Location>

    @GET("episode")
    suspend fun getEpisodes(): List<Episode>
}