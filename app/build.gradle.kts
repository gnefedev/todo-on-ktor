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
    implementation("ch.qos.logback:logback-classic:${Versions.logback}")

    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core:${Versions.kotest}")
}

tasks.test {
    useJUnitPlatform()
}
