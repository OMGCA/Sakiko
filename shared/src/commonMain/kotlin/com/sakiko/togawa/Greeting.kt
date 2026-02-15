package com.sakiko.togawa

class Greeting {
    private val platform = getPlatform()

    private val saki = Sakiko()

    fun greet(): String {
        return "Hello, ${this.saki.getFullname()}!"
    }
}