package EjerciciosKotlin

class Empleado(){
    private var edad:Int = 0
    private var nombre = "Jose"

    fun setEdad(_edad:Int) {
        if (_edad >=18 && _edad<=80){
            this.edad = _edad
            println("Tienes la edad correcta")
        } else {
            println("No tienes la edad adecuada")
        }

    }
    fun getEdad():Int {
        return edad + 1
    }

    fun setNombre(_nombre:String){
        if (!!nombre.isEmpty()) {
            this.nombre = _nombre
            println(_nombre+"Esta bien escrito")
        } else {
            println("NO tienes caracteres")
        }
    }
    fun getNombre():String{
        return nombre.toUpperCase()
    }
}