package philipplackner.oop.`class`

import philipplackner.oop.inheritance.Shape

class Rectangle(
    val a: Double,
    val b: Double
) : Shape() {

    constructor(a: Double) : this(a, a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    init {
        println("Rectangle created with a = $a and b = $b")
    }

    override fun area() = a * b

    override fun perimeter() = 2 * a * b

    fun isSquare() = a == b
}