package philipplackner.oop.`class`

import philipplackner.ImportantNumbers
import philipplackner.ImportantNumbers.PI
import philipplackner.oop.inheritance.Shape
import kotlin.random.Random

class Circle(val radius: Double) : Shape() {

    companion object {

        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }


    init {
        println("Circle created with radius = $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * PI

    override fun perimeter() = 2 * radius * PI
}