plugins {
    alias(libs.plugins.android.app)
    alias(libs.plugins.kotlin.android)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.cncoderx.test.wheelview"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.cncoderx.test.wheelview"
        minSdk = 26
        versionCode = 2
        versionName = "1.1"
    }
}


dependencies {
    implementation(project(":library"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}