package InterfazKotlinJV

import java.lang.management.ManagementFactory
import javax.swing.JFrame
import javax.swing.WindowConstants

class ventana:JFrame() {

    init {
        this.title = "Sistema ARK ${getPid()}"
        this.isVisible = true
        this.setSize(500,500)
        this.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE

        /*for (i in 1..9) {
            Thread.sleep(100)
            this.setLocation(i * 20, i * 20)
        }*/
        //setBounds(200, 200, 300, 300)
        setLocationRelativeTo(null)
    }

    fun getPid():String{
        return ManagementFactory.getRuntimeMXBean().name
    }

}