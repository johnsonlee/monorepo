pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
    includeBuild("../buildscripts")
}

includeBuild("../runtime")

include(":app")
