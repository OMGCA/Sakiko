package com.sakiko.togawa.service.provider

import com.sakiko.togawa.Sakiko
import com.sakiko.togawa.getPlatform
import com.sakiko.togawa.service.callback.ISakikoListener
import com.sakiko.togawa.service.callback.asISakikoListener
import com.tencent.tmm.knoi.annotation.ServiceProvider
import com.tencent.tmm.knoi.type.JSValue

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

    public fun greetSakiko(listener: JSValue): Unit {
        val listener: ISakikoListener = listener.asISakikoListener();
        listener.onKtCalled(this.saki.greetSakiko());
    }
}