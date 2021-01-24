package com.shopping.baselinbrary.ext

import android.view.View
import com.shopping.baselinbrary.data.protocol.BaseResp
import com.shopping.baselinbrary.rx.BaseFunc
import com.shopping.baselinbrary.rx.BaseFuncBoolean
import com.shopping.baselinbrary.rx.BaseSubscriber
import com.trello.rxlifecycle.LifecycleProvider
import rx.Observable
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
描述:
zhaochenshuo
2021/1/19
 */

fun <T> Observable<T>.execute(
    scbscriber: BaseSubscriber<T>,
    lifecycleProvider: LifecycleProvider<*>
) {
    this.observeOn(AndroidSchedulers.mainThread())
        .compose(lifecycleProvider.bindToLifecycle())
        .subscribeOn(Schedulers.io())
        .subscribe(scbscriber)
}

fun View.onClick(listener: View.OnClickListener) {
    this.setOnClickListener(listener)
}

fun View.onClick1(method: () -> Unit) {
    this.setOnClickListener { method() }
}

fun <T> Observable<BaseResp<T>>.convert(): Observable<T> {
    return this.flatMap(BaseFunc())
}

fun <T> Observable<BaseResp<T>>.convertBoolean(): Observable<Boolean> {
    return this.flatMap(BaseFuncBoolean())
}







