tasks.register("publishToMavenLocal") {
    dependsOn(gradle.includedBuild("compiler").task(":publishToMavenLocal"))
    dependsOn(gradle.includedBuild("runtime").task(":publishToMavenLocal"))
}
