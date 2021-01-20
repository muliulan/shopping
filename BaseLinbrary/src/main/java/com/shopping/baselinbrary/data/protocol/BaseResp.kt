package com.shopping.baselinbrary.data.protocol

/**
描述:
zhaochenshuo
2021/1/19
 */

data class BaseResp<T>(val status: Int,val msg: String,val data: T)