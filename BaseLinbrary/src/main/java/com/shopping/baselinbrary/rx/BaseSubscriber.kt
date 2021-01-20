package com.shopping.baselinbrary.rx

import rx.Subscriber

/**
描述:
zhaochenshuo
2021/1/19
 */

open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }

    override fun onNext(t: T) {
    }
}