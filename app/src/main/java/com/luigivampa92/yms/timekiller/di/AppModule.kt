package com.luigivampa92.yms.timekiller.di

import android.content.Context
import com.luigivampa92.yms.timekiller.TimeKillerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule()
{
    @Provides
    @Singleton
    fun provideApplication(app : TimeKillerApplication): Context = app
}