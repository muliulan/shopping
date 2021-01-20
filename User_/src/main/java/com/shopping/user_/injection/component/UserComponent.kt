package com.shopping.user_.injection.component

import com.shopping.user_.LoginActivity
import com.shopping.user_.injection.module.LoginModule
import dagger.Component

/**
描述:
zhaochenshuo
2021/1/20
 */
@Component(modules = [LoginModule::class])
interface UserComponent {
    fun inject(activity: LoginActivity)
}