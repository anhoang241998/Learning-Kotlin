package philipplackner.oop.`class`

fun main() {
    val rec = Rectangle(4.0, 7.0)
    println("Rectangle area is ${rec.area()}")
    println("Rectangle perimeter is ${rec.perimeter()}")
    println("Is rectangle a square? ${rec.isSquare()}")

    val circle = Circle(5.0)
    val circle2 = Circle(7.0)
}

