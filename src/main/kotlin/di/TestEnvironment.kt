package di

fun main() {
    val engine = Engine()
    val wheels = Wheels()
    val yokohamaWheels = YokohamaWheels()

    val car = Car(engine, wheels)
    car.drive()

    val yokohamaCar = Car(engine, yokohamaWheels)
    yokohamaCar.drive()

    val car2= Car2()
    val car3 = Car3()

    car2.drive()
    car3.drive()
}