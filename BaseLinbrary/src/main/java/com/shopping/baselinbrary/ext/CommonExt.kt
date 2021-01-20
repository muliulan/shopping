package com.shopping.baselinbrary.ext

import com.shopping.baselinbrary.rx.BaseSubscriber
import rx.Observable
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
描述:
zhaochenshuo
2021/1/19
 */

fun <T> Observable<T>.execute(scbscriber: BaseSubscriber<T>) {
    this.observeOn(AndroidSchedulers.mainThread())
        .subscribeOn(Schedulers.io())
        .subscribe(scbscriber)
}
