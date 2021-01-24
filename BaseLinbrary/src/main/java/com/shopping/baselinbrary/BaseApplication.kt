package com.shopping.baselinbrary

import android.app.Application
import com.shopping.baselinbrary.injection.component.AppComponent
import com.shopping.baselinbrary.injection.component.DaggerAppComponent
import com.shopping.baselinbrary.injection.module.AppModule

/**
描述:
zhaochenshuo
2021/1/21
 */

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initInjection()
    }

    private fun initInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}