package com.shopping.user_.impl

import rx.Observable


/**
描述:
zhaochenshuo
2021/1/19
 */

interface LoginService {

    fun register(a: String, b: String): Observable<Boolean>

}