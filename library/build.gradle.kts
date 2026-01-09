plugins {
    alias(libs.plugins.android.lib)
    alias(libs.plugins.kotlin.android)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.cncoderx.wheelview"
    compileSdk = 36
    defaultConfig {
        minSdk = 26
    }
}

dependencies {
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
