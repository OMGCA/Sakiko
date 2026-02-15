package com.sakiko.togawa

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform