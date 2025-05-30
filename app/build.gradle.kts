plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.sleepdepp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sleepdepp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)
    // Add your other dependencies here
}
