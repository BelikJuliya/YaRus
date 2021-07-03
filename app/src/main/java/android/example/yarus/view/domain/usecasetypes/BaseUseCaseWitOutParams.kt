package android.example.yarus.view.domain.usecasetypes

interface BaseUseCaseWitOutParams< R > {

    suspend fun run() : R

}