package android.example.yarus.view.presentation.characterFlow.list

import android.example.yarus.view.di.ViewModelFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class CharacterListFragment: Fragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        findNavController().navigate(CharacterListFragmentDirections.actrr(arg))

        val viewModel = ViewModelProvider(this, viewModelFactory)[CharacterListViewModel::class.java]

    }
}