package com.shopping.baselinbrary.rx

import com.shopping.baselinbrary.base.BaseView
import rx.Subscriber

/**
描述:
zhaochenshuo
2021/1/19
 */

open class BaseSubscriber<T>(private val mview:BaseView) : Subscriber<T>() {
    override fun onCompleted() {
        mview.showLoading()
    }

    override fun onError(e: Throwable?) {
    }

    override fun onNext(t: T) {
        mview.hideLoading()
    }
}