package com.shopping.user_

import android.os.Bundle
import android.util.Log
import com.shopping.baselinbrary.base.activity.BaseMvpActivity
import com.shopping.baselinbrary.ext.onClick
import com.shopping.user_.inf.LoginView
import com.shopping.user_.injection.component.DaggerUserComponent
import com.shopping.user_.injection.module.LoginModule
import com.shopping.user_.presenter.LoginPresenter
import kotlinx.android.synthetic.main.act_login.*

/**
描述:
zhaochenshuo
2021/1/12
 */

class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_login)
        et_text
        et_pass

        button.onClick {
            mPresenter.login("1", "1")
        }

    }

    override fun loginOk(a: String) {
        Log.e("mll", a)
    }

    override fun injectComponent() {
        DaggerUserComponent.builder().activityComponent(activityComponent)
            .loginModule(LoginModule()).build().inject(this)
        mPresenter.mView = this
    }


}