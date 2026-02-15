package com.sakiko.togawa

class OHOSPlatform: Platform {
    override val name: String = "OpenHarmony"
}

actual fun getPlatform(): Platform = OHOSPlatform()