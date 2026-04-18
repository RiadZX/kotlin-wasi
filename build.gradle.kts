plugins {
    kotlin("multiplatform") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    @OptIn(org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl::class)
    wasmWasi {
        binaries.executable()
        nodejs()
    }

    sourceSets {
        val wasmWasiMain by getting {
            dependencies {
                implementation(kotlin("stdlib-wasm-wasi"))
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec>().configureEach {
    standardInput = System.`in`
}

tasks.register("runWasm") {
    group = "application"
    description = "Runs the Wasm/WASI binary"
    dependsOn("wasmWasiNodeDevelopmentRun")
}