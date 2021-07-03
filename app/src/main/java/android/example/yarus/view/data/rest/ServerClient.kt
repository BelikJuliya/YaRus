package android.example.yarus.view.data.rest

import android.example.yarus.view.domain.entities.Character
import android.example.yarus.view.domain.entities.Episode
import android.example.yarus.view.domain.entities.Location
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//class ServerClient: IServerApiClient {
//    private val retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl("https://rickandmortyapi.com/api")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }
//
//    val api: ApiService by lazy {
//        retrofit.create(ApiService::class.java)
//    }
//
////    override suspend fun getCharacters(): IResponse<List<Character>> {
////        api.getCharacters()
////    }
//
//    override suspend fun getLocations(): IResponse<List<Location>> {
//        TODO("Not yet implemented")
//    }
//
//    override suspend fun getEpisodes(): IResponse<List<Episode>> {
//        TODO("Not yet implemented")
//    }
//}