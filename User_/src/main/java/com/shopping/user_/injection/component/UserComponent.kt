package com.shopping.user_.injection.component

import com.shopping.baselinbrary.injection.PerComponentScope
import com.shopping.baselinbrary.injection.component.ActivityComponent
import com.shopping.user_.LoginActivity
import com.shopping.user_.injection.module.LoginModule
import dagger.Component

/**
描述: 依赖于ActivityComponent
zhaochenshuo
2021/1/20
 */
@PerComponentScope
@Component(dependencies = [ActivityComponent::class] ,modules = [LoginModule::class])
interface UserComponent {
    fun inject(activity: LoginActivity)
}