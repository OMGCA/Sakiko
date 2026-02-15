package com.sakiko.togawa.service.provider

import com.sakiko.togawa.Sakiko
import com.sakiko.togawa.getPlatform
import com.tencent.tmm.knoi.annotation.ServiceProvider

@ServiceProvider
open class SakikoProvider (
    val saki: Sakiko = Sakiko()
) {
    public fun getLastname(): String {
        return this.saki.getLastname();
    }

    public fun getFirstname(): String {
        return this.saki.getFirstname()
    }

    public fun getFullname(): String {
        return this.saki.getFullname()
    }

    public fun getSourceDate(): String {
        return this.saki.getSourceDate()
    }

    public fun getSystemVer(): String {
        return getPlatform().name
    }
}