package com.shopping.baselinbrary.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides

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