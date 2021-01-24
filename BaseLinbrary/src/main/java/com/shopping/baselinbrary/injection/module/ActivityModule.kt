package com.shopping.baselinbrary.injection.module

import android.app.Activity
import android.content.Context
import com.shopping.baselinbrary.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
描述:
zhaochenshuo
2021/1/21
 */
@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesActivity(): Activity {
        return activity
    }

}