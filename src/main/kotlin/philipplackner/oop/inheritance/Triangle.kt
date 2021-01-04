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

    fun perimeter() = a + b + c


}