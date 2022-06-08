pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        google()
    }
    includeBuild("buildscripts")
}

includeBuild("examples")
includeBuild("compiler")
includeBuild("runtime")
