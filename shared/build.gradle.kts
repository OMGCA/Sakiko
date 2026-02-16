import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kuiklyKnoi)
}

kotlin {
    ohosArm64 {
        binaries {
            sharedLib()
        }
    }

    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            // put your Multiplatform dependencies here
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.sakiko.togawa.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

tasks.register<Copy>("copyOhosIntf") {
    from("./build/ts-api/provider.ets")
    into("../ohosApp/KMPSakiko/src/main/ets")
}

tasks.register<Copy>("copyOhosCsm") {
    from("./build/ts-api/consumer.d.ts")
    into("../ohosApp/KMPSakiko/src/main/ets")
    rename("consumer.d.ts", "consumer.ets")
}

tasks.register<Copy>("copyOhosCallback") {
    from("./build/ts-api/callback.d.ts")
    into("../ohosApp/KMPSakiko/src/main/ets")
    rename("callback.d.ts", "callback.ets")
}

tasks.register<Copy>("copyOhosLib") {
    from("./build/bin/ohosArm64/debugShared/libshared.so")
    into("../ohosApp/KMPSakiko/libs/arm64-v8a")
}

tasks.named("linkOhosArm64") {
    finalizedBy("copyOhosIntf", "copyOhosLib", "copyOhosCsm", "copyOhosCallback")
}
