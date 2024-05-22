package EjerciciosKotlin

import java.util.ArrayList
import javax.swing.JOptionPane

fun main(args:Array<String>){
    // FOR NORMAL
    var altura = JOptionPane.showInputDialog("Tamanio de la escalera").toInt()
    for(i in 1..altura){
        for (j in 1..i) {
            print("*")
        }
    println("**")
    }

    // FOR EACH
    var lista=arrayListOf(1,5,9,7,9,3,2,0)
    var asc:ArrayList<Int>?? = null

    for (i in 0..9){
        for(j in 0..i){
            if (lista [i]>j){
                 asc!!.add(lista[i])
            }
        }
    }
    println(asc)
}