package com.luigivampa92.yms.timekiller.di

import com.luigivampa92.yms.timekiller.TimeKillerApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules=arrayOf(AppModule::class,AndroidInjectionModule::class, ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        fun application(application:TimeKillerApplication): Builder

        fun build(): AppComponent
    }

    fun inject (app:TimeKillerApplication)
}