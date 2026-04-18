fun main() {
    println("Hello from Kotlin/Wasm!")
    println("Note: stdin is not fully supported in Node.js WASI")
    println("Use command line args or read from files instead")
}

// https://github.com/JetBrains/kotlin/blob/2.3.20/libraries/stdlib/wasm/wasi/src/kotlin/io.kt#L98
// readLn is not supported it is TODO.....

// https://github.com/JetBrains/kotlin/blob/2.3.20/libraries/stdlib/wasm/js/src/kotlin/io.kt
// also not in wasm js