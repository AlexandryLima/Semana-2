fun main() {
    while (true) {
        print("Digite um número: ")
        val numero = readLine()!!.toInt()
        if (numero < 0) {
            break
        }
        println("Número digitado: $numero")
    }
    println("Fim do programa.")
}