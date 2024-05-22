package EjerciciosKotlin

fun main(args: Array<String>) {
    var element = true

   /* while (element) {
        println("Selecciona una opcion:\n-Ayuda\n-Configuracion\n-salir")

        var opcion:String = readLine()!!
        opcion = opcion.toLowerCase()
        when (opcion) {
            "Ayuda" -> {
                println("Haz seleccionado ayuda")
            }
            "Configuracion" -> {
                println("Haz seleccionado configuracion")
            }
            "Salir" -> {
                element = false
                println("Haz seleccionado salir")
            }
            else -> {
                println("Opcion incorrecta")
            }
        }
    }*/


    println("responde con un hola")
    var respuesta = readLine()!!.toLowerCase()
    if (respuesta=="hola")
        println("respondiste bien")
    else
        println("respuesta incorrecta")

}