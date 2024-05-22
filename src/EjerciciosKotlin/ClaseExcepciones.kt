package EjerciciosKotlin

fun main(args: Array<String>) {
    println("Sistema bancario BNB")

    var saldo = 500.50
    var reload = true
    while (reload){
        println("Elige una opcion: \n 1. Consulta tu saldo.\n 2. Ingresa efectivo.\n 3. Retira efectivo.\n 4. Salir")
        try {
            var opcion = readLine()!!.toInt()
            when (opcion) {
                1 -> {
                    println("Saldo disponible: $saldo")
                }
                2 -> {
                    try {
                        saldo += readLine()!!.toDouble()
                        println("Saldo Actual disponible: $saldo ")
                    } catch (e:Exception){
                        println("Invalido $e")
                    }

                }
                3 -> {
                    try {
                        var retiro = readLine()!!.toDouble()
                        if (saldo - retiro <0){
                            println("No disponible, tu saldo actual es: $saldo")
                        } else {
                            saldo -= retiro
                            println("Tu saldo actual es: $saldo")
                        }
                    } catch (e:Exception){
                        println("invalido $e")
                    }

                }
                4 -> {
                    reload = false
                    println("Gracias......! por usar BNB")
                }
                else -> {
                    println("Opcion invalida")
                }
            }
        }
        catch (e:Exception){
            println("Opcion invalida $e")
        }
    }

}






















