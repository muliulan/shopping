package com.shopping.baselinbrary.base

import javax.inject.Inject

/**
描述:
zhaochenshuo
2021/1/13
 */

open class BaseMvpActivity<T:BasePresenter<*>> :BaseActivity(),BaseView{

    @Inject
    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }

}