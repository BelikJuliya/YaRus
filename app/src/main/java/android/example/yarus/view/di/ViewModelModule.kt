package android.example.yarus.view.di

import android.example.yarus.view.presentation.characterFlow.list.CharacterListViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CharacterListViewModel::class)
    abstract fun splashViewModel(viewModel: CharacterListViewModel): ViewModel
}