package com.shopping.user_.injection.module

import com.shopping.user_.LoginServiceImpl
import com.shopping.user_.impl.LoginService
import dagger.Module
import dagger.Provides

/**
描述:
zhaochenshuo
2021/1/20
 */
@Module
class LoginModule {

    @Provides
    fun providesUserService(service: LoginServiceImpl):LoginService{
        return service
    }

}