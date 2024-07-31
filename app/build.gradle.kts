plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    id("momin.androidCraft.android.application")
    id("momin.androidCraft.android.application.compose")
    id("momin.androidCraft.android.hilt")
    id("momin.androidCraft.spotless")
}

android {
    namespace = "com.example.androidcraft"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.androidcraft"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // features
//    implementation(projects.feature.home)
//    implementation(projects.feature.details)
//
//    // cores
//    implementation(projects.core.model)
//    implementation(projects.core.designsystem)
//    implementation(projects.core.navigation)

    // compose
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.compose.foundation)

    // di
    implementation(libs.hilt.android)
//    ksp(libs.hilt.compiler)
    androidTestImplementation(libs.hilt.testing)
//    kspAndroidTest(libs.hilt.compiler)

    // baseline profile
    implementation(libs.profileinstaller)
//    baselineProfile(project(":baselineprofile"))

    // unit test
    testImplementation(libs.junit)
    testImplementation(libs.turbine)
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.kotlinx.coroutines.test)
    androidTestImplementation(libs.truth)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso)
//  androidTestImplementation(libs.android.test.runner)
}