package com.sakiko.togawa

class Sakiko {
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

    public fun getSystemVer(): String {
        return getPlatform().name
    }
}