package philipplackner.oop.inheritance

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double,
) : Shape("Triangle") {

    init {
        println("$name created with a = $a, b = $b, c = $c")
        println("$name perimeter is ${perimeter()}")
    }

    override fun perimeter() = a + b + c

    override fun area(): Double {
        return 5.0
    }


}
