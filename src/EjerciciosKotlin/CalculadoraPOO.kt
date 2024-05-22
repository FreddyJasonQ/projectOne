package EjerciciosKotlin

class Calculadora(){

    public fun suma(num1:Int, num2:Int):Int{
        var suma = num1 + num2
        return suma
    }
    public fun resta(num1:Int, num2:Int):Int{
        var resta = num1 - num2
        return resta
    }
    public fun multiplicacion(num1:Int, num2:Int):Int{
        var multi = num1 * num2
        return multi
    }
    public fun dividir(num1:Double,num2:Double):Double{
        var div = num1/num2
        return div
    }
}