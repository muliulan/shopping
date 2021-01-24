package com.shopping.user_.presenter

import com.shopping.baselinbrary.base.BasePresenter
import com.shopping.baselinbrary.ext.execute
import com.shopping.baselinbrary.rx.BaseSubscriber
import com.shopping.user_.LoginServiceImpl
import com.shopping.user_.inf.LoginView
import rx.schedulers.Schedulers
import java.util.concurrent.Flow
import javax.inject.Inject

/**
描述:
zhaochenshuo
2021/1/13
 */

class LoginPresenter @Inject constructor() : BasePresenter<LoginView>() {

    @Inject
    lateinit var loginServiceImpl: LoginServiceImpl


    fun login(a: String, b: String) {
        loginServiceImpl.register(a, b)
            .execute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    super.onNext(t)
                    mView.loginOk(if (t) "注册成功" else "失败")
                }
            },lifecycleProvider)
//        mView.loginOk("注册成功")
    }
}