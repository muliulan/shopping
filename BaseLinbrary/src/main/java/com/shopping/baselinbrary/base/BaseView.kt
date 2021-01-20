package com.shopping.baselinbrary.base

/**
描述:
zhaochenshuo
2021/1/13
 */

interface BaseView {

    fun showLoading()
    fun hideLoading()
    fun onError(text: String)
}