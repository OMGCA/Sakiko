package com.sakiko.togawa.service.provider

import com.tencent.tmm.knoi.annotation.ServiceProvider

@ServiceProvider
open class SakikoProvider {
    public fun getLastname(): String {
        return "Togawa";
    }

    public fun getFirstname(): String {
        return "Sakiko";
    }
}