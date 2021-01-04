package philipplackner.oop.inheritance

fun main() {
    val triangle = Triangle(12.0, 1.0, 5.0)
    triangle.changeName("Circle")
    println(triangle.name)
}