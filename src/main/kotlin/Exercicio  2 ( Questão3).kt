fun main(){

    println("Escreva um valor de 0 a 10: ")

    var x: Int = readln().toInt()

    do {
        println(x)
        x = readln().toInt()
    }while (x != 4)

}