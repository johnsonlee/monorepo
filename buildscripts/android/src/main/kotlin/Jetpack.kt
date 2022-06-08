object config {
    const val compileSdkVersion = 31
    const val minSdkVersion = 21
    const val targetSdkVersion = 31
}


object jetpack {

    private fun androidx(component: String, module: String, version: String) = "androidx.${component}:${module}:${version}"

    val annotation = androidx("annotation", "annotation", "1.0.0")

    val appcompat = androidx("appcompat", "appcompat", "1.4.1")

    val constraintlayout = androidx("constraintlayout", "constraintlayout", "2.1.4")

    val coreKtx = androidx("core", "core-ktx", "1.7.0")

    val tracing = androidx("tracing", "tracing-ktx", "1.0.0")

    object test {
        object ext {
            val junit = androidx("test.ext", "junit", "1.1.3")
        }
        object espresso {
            val core = androidx("test.espresso", "espresso-core", "3.4.0")
        }
    }

}