package com.luigivampa92.yms.timekiller

import android.app.Application

class TimeKillerApplication : Application() {

    companion object {
        @JvmStatic lateinit var INSTANCE : TimeKillerApplication
    }

//    @Inject
//    protected lateinit var activityInjector: DispatchingAndroidInjector<Activity>
//    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

//    private lateinit var appComponent: AppComponent
//    fun getAppComponent() = appComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this

//        val build = DaggerAppComponent.builder().withContext(this).build()

//        appComponent.inject(this)
    }
}