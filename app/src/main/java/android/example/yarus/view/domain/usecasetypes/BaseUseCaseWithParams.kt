package android.example.yarus.view.domain.usecasetypes

interface BaseUseCaseWithParams< P, R > {

    suspend fun run(params : P) : R

}