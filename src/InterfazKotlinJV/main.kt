package InterfazKotlinJV

import javax.swing.JFrame
import javax.swing.WindowConstants

fun main(args:Array <String>) {
    var v = ventanas()
}

class ventanas():JFrame(){

    init {
        this.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        this.isVisible = true
        //this.setBounds(200, 200, 400, 400)
        //this.setLocation(400, 400)
        this.setSize(400, 400)
        this.setLocationRelativeTo(null)

        /*for (i in 1..10){
            Thread.sleep(100)
            setLocation(20*i, 20*i)
        }*/

    }
}