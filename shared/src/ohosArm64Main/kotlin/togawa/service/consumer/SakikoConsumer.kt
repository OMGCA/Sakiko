package com.sakiko.togawa.service.consumer

import com.tencent.tmm.knoi.annotation.ServiceConsumer

@ServiceConsumer
interface SakikoConsumer {
    public fun getSystemVer(): String
}