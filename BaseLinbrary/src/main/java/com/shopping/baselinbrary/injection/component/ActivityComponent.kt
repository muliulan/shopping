package com.shopping.baselinbrary.injection.component

import android.app.Activity
import android.content.Context
import com.shopping.baselinbrary.injection.ActivityScope
import com.shopping.baselinbrary.injection.module.ActivityModule
import com.shopping.baselinbrary.injection.module.AppModule
import com.shopping.baselinbrary.injection.module.LifecycleProviderModule
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Component
import java.sql.Array
import javax.inject.Singleton

/**
描述:     依赖于AppComponent
zhaochenshuo
2021/1/21
 */
@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ActivityModule::class, LifecycleProviderModule::class]
)
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
    fun lifecycleProvider(): LifecycleProvider<*>
}