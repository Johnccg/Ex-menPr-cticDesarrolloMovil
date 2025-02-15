plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.examendesarrollomoviles"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.examendesarrollomoviles"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //Corrutinas
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1")

    //Fragment
    implementation("androidx.fragment:fragment-ktx:1.5.0")

    //Activity
    implementation("androidx.activity:activity-ktx:1.5.0")

    //Data binding
    implementation("androidx.databinding:databinding-runtime:7.1.2")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")

    // Parse
    implementation("com.github.parse-community.Parse-SDK-Android:parse:4.3.0")
}