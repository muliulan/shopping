package com.shopping.baselinbrary.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shopping.baselinbrary.common.AppManager
import com.trello.rxlifecycle.components.RxActivity

/**
描述:
zhaochenshuo
2021/1/13
 */

open class BaseActivity : RxActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppManager.instance.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        AppManager.instance.finishActivity(this)
    }
}