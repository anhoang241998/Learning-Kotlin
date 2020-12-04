package di

class Car2() {

    var engine: Engine
    var wheels: Wheels

    init {

        engine = Engine()
        wheels = Wheels()

        engine.startEngine()
        wheels.rolling4Wheels()
    }

    fun drive() {

    }
}