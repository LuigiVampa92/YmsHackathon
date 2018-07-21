package com.luigivampa92.yms.timekiller

import android.app.Activity
import android.app.Application
import com.luigivampa92.yms.timekiller.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class TimeKillerApplication : Application(), HasActivityInjector {

    companion object {
        @JvmStatic lateinit var INSTANCE : TimeKillerApplication
    }

    @Inject
    lateinit var activityInjector : DispatchingAndroidInjector<Activity>

//    @Inject
//    protected lateinit var activityInjector: DispatchingAndroidInjector<Activity>
//    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

//    private lateinit var appComponent: AppComponent
//    fun getAppComponent() = appComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

        DaggerAppComponent.builder().application(this).build().inject(this)

//        appComponent.inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}