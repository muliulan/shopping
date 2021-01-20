package com.shopping.baselinbrary.base

/**
描述:
zhaochenshuo
2021/1/13
 */

open class BasePresenter<T:BaseView> {

    lateinit var mView: T

}