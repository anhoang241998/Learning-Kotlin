package philipplackner.oop.`class`

class Rectangle(
    val a: Double,
    val b: Double
) {

    constructor(a: Double) : this(a, a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    init {
        println("Rectangle created with a = $a and b = $b")
    }

    fun area() = a * b

    fun perimeter() = 2 * a * b

    fun isSquare() = a == b
}