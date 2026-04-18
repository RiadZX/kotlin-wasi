
fun main() {
    println("test")
    while (true) {
        val input = readlnOrNull()

        if (input.isNullOrEmpty() || input == "exit")  {
            println("exiting because input was nullorEmpty or exit command.")
            break
        }

        println("Wasm received: $input")
    }
}