fun main() {
    var x1: Double
    var y1: Double
    var x2: Double
    var y2: Double
    var distancia: Double

    print("Ingresa la coordenada x1: ")
    x1 = readLine()!!.toDouble()

    print("Ingresa la coordenada y1: ")
    y1 = readLine()!!.toDouble()

    print("Ingresa la coordenada x2: ")
    x2 = readLine()!!.toDouble()

    print("Ingresa la coordenada y2: ")
    y2 = readLine()!!.toDouble()

    distancia = Math.sqrt(
        (x2 - x1) * (x2 - x1) +
        (y2 - y1) * (y2 - y1)
    )


    println("La distancia entre los dos puntos es: $distancia")
}