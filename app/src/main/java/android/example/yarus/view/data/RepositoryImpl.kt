package android.example.yarus.view.data

import android.example.yarus.view.data.rest.ApiService
import android.example.yarus.view.domain.entities.IRepository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    val sampleApiService: ApiService): IRepository {
}