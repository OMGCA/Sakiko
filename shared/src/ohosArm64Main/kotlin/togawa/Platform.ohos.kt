package com.sakiko.togawa

import com.sakiko.togawa.service.consumer.getSakikoConsumerApi

class OHOSPlatform: Platform {
    override val name: String = "OpenHarmony" + getSakikoConsumerApi().getSystemVer()
}

actual fun getPlatform(): Platform = OHOSPlatform()