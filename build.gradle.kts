import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    kotlin("jvm") version "1.8.20"
    id("com.github.ben-manes.versions") version "0.46.0"
    idea
}

group = "com.gildedrose"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_17

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
