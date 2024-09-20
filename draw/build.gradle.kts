plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    `maven-publish`
}

android {
    namespace = "com.papayacoders.draw"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    viewBinding {
        enable = true
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}


group = "com.papayacoders.draw"
version = "1.0.8"


//tasks.named("publishToMavenLocal") {
//    dependsOn("assembleRelease")

// Configure the publishing
//publishing {
//    publications {
//        create<MavenPublication>("release") {
//            from(components["release"]) // Adjust if you're publishing a different component
//
//            groupId = "com.papayacoders.draw"
//            artifactId = "AndroidDraw"
//            version = "1.0.6" // Ensure this matches your versioning
//
//            // Optionally, specify POM details
//            pom {
//                name.set("AndroidDraw")
//                description.set("Description of your project")
//                url.set("https://github.com/1902shubh/AndroidDraw")
//
//                // Add developers, licenses, etc., if needed
//            }
//        }
//    }
//}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}