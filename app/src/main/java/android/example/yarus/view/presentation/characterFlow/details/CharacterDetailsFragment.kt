package android.example.yarus.view.presentation.characterFlow.details

import android.example.yarus.R
import android.example.yarus.view.di.ViewModelFactory
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class CharacterDetailsFragment: Fragment(R.layout.fragment_character_details) {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

   // val binding : FragmentCharacterDetailsViewBinding by viewBinding(FragmentCharacterDetailsViewBinding::bind)
    //private val viewModel: CharacterDetailsViewModel by viewModels()
    //private args : CharacterDetailsFragmenArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(this, viewModelFactory)[CharacterDetailsViewModel::class.java]
    }
}