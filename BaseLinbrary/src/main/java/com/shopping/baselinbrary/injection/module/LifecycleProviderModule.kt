package com.shopping.baselinbrary.injection.module

import android.content.Context
import com.shopping.baselinbrary.BaseApplication
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
描述:
zhaochenshuo
2021/1/21
 */
@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {

    @Provides
    fun provideLifecycleProvider(): LifecycleProvider<*> {
        return this.lifecycleProvider
    }
}