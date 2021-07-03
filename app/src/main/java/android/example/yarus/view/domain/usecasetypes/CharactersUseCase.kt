package android.example.yarus.view.domain.usecasetypes

import android.example.yarus.view.domain.entities.Character
import android.example.yarus.view.domain.entities.IRepository
import javax.inject.Inject

class CharactersUseCase @Inject constructor(val repository: IRepository): BaseUseCaseWitOutParams<List<Character>> {
    override suspend fun run(): List<Character> {
        TODO()
    }
}