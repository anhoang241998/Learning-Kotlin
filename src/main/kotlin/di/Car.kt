package di

class Car(private var engine: Engine, private var wheels: Wheels) {

    init {
        engine.startEngine()
        wheels.rolling4Wheels()
    }

    fun drive() {

    }

}