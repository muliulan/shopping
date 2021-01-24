package com.shopping.user_

import android.util.Log
import com.shopping.baselinbrary.data.BaseException
import com.shopping.baselinbrary.data.net.RetrofitFactory
import com.shopping.baselinbrary.data.protocol.BaseResp
import com.shopping.baselinbrary.ext.convertBoolean
import com.shopping.baselinbrary.ext.execute
import com.shopping.baselinbrary.rx.BaseFuncBoolean
import com.shopping.baselinbrary.rx.BaseSubscriber
import com.shopping.user_.impl.LoginService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

/**
描述:
zhaochenshuo
2021/1/19
 */

class LoginServiceImpl @Inject constructor() : LoginService {
    //2.1
    override fun register(a: String, b: String): Observable<Boolean> {
        val login = RetrofitFactory.instance.create(LoginApi::class.java).login()

        return login.convertBoolean()
    }

}



