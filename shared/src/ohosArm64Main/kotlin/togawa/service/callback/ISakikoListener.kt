package com.sakiko.togawa.service.callback

import com.tencent.tmm.knoi.annotation.KNCallback

@KNCallback
interface ISakikoListener {
    public fun onKtCalled(msg: String)
}