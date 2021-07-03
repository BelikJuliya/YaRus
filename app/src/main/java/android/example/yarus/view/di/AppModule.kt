package android.example.yarus.view.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application): Context


//    @Provides
//    @Singleton
//    fun providesICharacterRepository(iEpdisodeRepository: IEpdisodeRepository):ICharacterRepository {
//        return CharacterRepositoryImpl(iEpdisodeRepository)
//    }
//
//
//    @Provides
//    @Singleton
//    fun providesIEpideRepository(application: Application): IEpdisodeRepository {
//        return EpisodeRepositoryImpl(application)
//    }
}