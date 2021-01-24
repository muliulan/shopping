package com.shopping.baselinbrary.injection.component

import android.content.Context
import com.shopping.baselinbrary.injection.module.AppModule
import dagger.Component
import java.sql.Array
import javax.inject.Singleton

/**
描述:
zhaochenshuo
2021/1/21
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun context():Context
}