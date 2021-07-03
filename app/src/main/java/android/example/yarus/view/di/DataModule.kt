package android.example.yarus.view.di

import android.example.yarus.view.data.RepositoryImpl
import android.example.yarus.view.domain.entities.IRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideRepository(repositoryImpl: RepositoryImpl) : IRepository
}