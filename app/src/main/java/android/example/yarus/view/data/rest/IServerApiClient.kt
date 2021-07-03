package android.example.yarus.view.data.rest

import android.example.yarus.view.domain.entities.Character
import android.example.yarus.view.domain.entities.Episode
import android.example.yarus.view.domain.entities.Location
import retrofit2.http.GET

interface IServerApiClient {
    suspend fun getCharacters(): IResponse<List<Character>>
    suspend fun getLocations(): IResponse<List<Location>>
    suspend fun getEpisodes(): IResponse<List<Episode>>
}
