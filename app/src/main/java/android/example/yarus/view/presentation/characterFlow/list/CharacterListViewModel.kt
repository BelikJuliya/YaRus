package android.example.yarus.view.presentation.characterFlow.list

import android.example.yarus.view.data.Repository
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CharacterListViewModel @Inject constructor(val repository: Repository) : ViewModel() {
//    fun getCharacters(){
//        viewModelScope.launch {
//            characters.value = repository.getCharacters()
//        }
//    }
}