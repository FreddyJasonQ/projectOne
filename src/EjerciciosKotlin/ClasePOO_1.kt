package EjerciciosKotlin

class Auto(){
    private lateinit var color:String
    private lateinit var modelo:String
    private lateinit var matricula:String
    private var acceso = false

    public fun llave(clave:String){
        if (clave == "12345"){
            acceso = true
            println("Tiens acceso")

        } else {
            println("No tiens acceso")
        }
    }

    public fun mando(accion:String){
        if (acceso){
            when(accion){
                "encender" -> encender()
                "acelerar" -> acelerar()
                "frenar" -> frenar()
                else -> println("accion no apta")
            }
        } else {
            println("No tienes acceso")
        }
    }


    private fun encender() {
        println("Encendiendo")
    }

    private fun acelerar(){
        println("Acelerando")
    }
    private fun frenar() {
        println("frenando")
    }
}

fun main(args:Array<String>){
    var coche1 = Auto()

    coche1.llave("12345")
    coche1.mando("encender")
    coche1.mando("acelerar")
    coche1.mando("frenar")
}