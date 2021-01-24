package com.shopping.baselinbrary.base.activity

import android.os.Bundle
import com.shopping.baselinbrary.BaseApplication
import com.shopping.baselinbrary.base.BasePresenter
import com.shopping.baselinbrary.base.BaseView
import com.shopping.baselinbrary.injection.component.ActivityComponent
import com.shopping.baselinbrary.injection.component.DaggerActivityComponent
import com.shopping.baselinbrary.injection.module.ActivityModule
import com.shopping.baselinbrary.injection.module.LifecycleProviderModule
import javax.inject.Inject

/**
描述:
zhaochenshuo
2021/1/13
 */

abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    @Inject
    lateinit var mPresenter: T
    lateinit var activityComponent: ActivityComponent

  abstract  fun injectComponent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injectComponent()
        initActivityInjection()
    }

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
            .appComponent((application as BaseApplication).appComponent).activityModule(
                ActivityModule(this)
            ).lifecycleProviderModule(LifecycleProviderModule(this)).build()
    }


    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }


}