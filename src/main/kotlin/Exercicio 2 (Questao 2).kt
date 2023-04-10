fun main(){

    println("Escreva um valor: ")

    var x: Int = readln().toInt()

    do {
        println(x)
        x = readln().toInt()
    }while (x>0)

}