package di

class Engine() {

    var pump: Pump

    init {
        pump = Pump()
        pump.pumping()
    }

    fun startEngine() {
        println("Start Engine")
    }
}