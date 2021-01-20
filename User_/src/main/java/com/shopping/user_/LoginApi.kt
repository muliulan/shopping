package com.shopping.user_

import com.shopping.baselinbrary.data.protocol.BaseResp
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import rx.Observable

/**
描述:
zhaochenshuo
2021/1/19
 */

interface LoginApi {

    @GET("/get")
    fun login(): Observable<BaseResp<String>>
//    fun login(@Body req: RegisterReg): Observable<BaseResp<String>>


}