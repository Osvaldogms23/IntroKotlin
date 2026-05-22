fun main(parametro: Array<String>) {
    val sueldo: IntArray
    sueldo = IntArray(5)

    for (i in 0..4) {
        print("Ingresa sueldo:")
        sueldo[i] = readln().toInt()
    }

    for(i in 0..4) {
        println(sueldo[i])
    }
}