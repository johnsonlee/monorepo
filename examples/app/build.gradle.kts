plugins {
    id("android-application-convention")
}

dependencies {
    implementation("${group}:runtime")
    implementation(jetpack.coreKtx)
    implementation(jetpack.appcompat)
    implementation(jetpack.constraintlayout)
    implementation(google.material)
    androidTestImplementation(jetpack.test.ext.junit)
    androidTestImplementation(jetpack.test.espresso.core)
}