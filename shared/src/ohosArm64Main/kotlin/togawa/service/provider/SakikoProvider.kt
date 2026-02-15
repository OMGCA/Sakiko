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

    public fun getFullname(): String {
        return "Sakiko Togawa";
    }

    public fun getSourceDate(): String {
        return "2.14";
    }
}