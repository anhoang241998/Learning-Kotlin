package philipplackner.oop.`class`

import philipplackner.oop.inheritance.Shape

class Circle(val radius: Double) : Shape() {

    private val pi = 3.141592

    init {
        println("Circle created with radius = $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * pi

    override fun perimeter() = 2 * radius * pi
}