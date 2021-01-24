package com.shopping.baselinbrary.injection.module

import android.content.Context
import com.shopping.baselinbrary.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
描述:
zhaochenshuo
2021/1/21
 */
@Module
@Singleton
class AppModule(private val context: BaseApplication) {

    @Provides
    @Singleton
    fun providesContext(): Context {
        return context
    }

}