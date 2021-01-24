package com.shopping.baselinbrary.base

import com.trello.rxlifecycle.LifecycleProvider
import javax.inject.Inject

/**
描述:
zhaochenshuo
2021/1/13
 */

open class BasePresenter<T:BaseView> {

    lateinit var mView: T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

}