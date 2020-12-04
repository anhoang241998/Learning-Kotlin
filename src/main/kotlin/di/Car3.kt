package di

class Car3 {

    private var engine: Engine
    private var wheels: YokohamaWheels

    init {

        engine = Engine()
        wheels = YokohamaWheels()

        engine.startEngine()
        wheels.rolling4Wheels()
    }

    fun drive() {

    }

}