package android.example.yarus.view.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [(AndroidInjectionModule::class), (AndroidSupportInjectionModule::class),
        (AppModule::class), (DataModule::class), (ViewModelModule::class)]
)
interface AppComponent : AndroidInjector<ApplicationClass> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

}