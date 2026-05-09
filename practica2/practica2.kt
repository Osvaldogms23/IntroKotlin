fun main() {
    var a: Int
    var b: Int
    var resultado = 0

    print("Ingresa el valor de a: ")
    a = readLine()!!.toInt()

    print("Ingresa el valor de b: ")
    b = readLine()!!.toInt()
    
    for (i in 1..b) {
        resultado += a
    }

    println("$a x $b = $resultado")
}