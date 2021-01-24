package com.shopping.baselinbrary.rx

import com.shopping.baselinbrary.data.BaseException
import com.shopping.baselinbrary.data.protocol.BaseResp
import rx.Observable
import rx.functions.Func1

/**
描述:
zhaochenshuo
2021/1/21
 */

open class BaseFunc<T> : Func1<BaseResp<T>, Observable<T>> {
    override fun call(t: BaseResp<T>): Observable<T> {
        if (t.status != 0) {
            return Observable.error(BaseException(t.status, t.msg))
        }
        return Observable.just(t.data)
    }


}