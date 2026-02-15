rootProject.name = "Sakiko"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        maven {
            url = uri("https://mirrors.tencent.com/nexus/repository/maven-tencent/")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        maven {
            url = uri("https://mirrors.tencent.com/nexus/repository/maven-tencent/")
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":shared")