plugins {
    kotlin("jvm")
    application
    kotlin("plugin.serialization") version Versions.kotlin
}

application {
    mainClass.set("com.gnefedev.todo.MainKt")
}

dependencies {
    implementation("io.ktor:ktor-server-core:${Versions.ktor}")
    implementation("io.ktor:ktor-server-netty:${Versions.ktor}")
    implementation("io.ktor:ktor-serialization:${Versions.ktor}")
    implementation("io.insert-koin:koin-ktor:${Versions.koin}")
    implementation("ch.qos.logback:logback-classic:${Versions.logback}")

    testImplementation("io.kotest:kotest-assertions-core:${Versions.kotest}")

    testImplementation("io.insert-koin:koin-test-junit5:${Versions.koin}") {
        //don't use junit at all
        exclude(group = "junit", module = "junit")
    }
}

tasks.test {
    useJUnitPlatform()
}
