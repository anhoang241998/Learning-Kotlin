package philipplackner

import philipplackner.oop.inheritance.Shape

fun main() {

    val a = 3.0
    val b = 4.0
    val height = 2.0

    val parallelogram = object : Shape("Paralellogram", a, b, height) {

        init {
            println("Parallelogram created with a = $a, b = $b, height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }

        fun isRectangle(): Boolean = height == b
    }
    
    println("Is the parallelgram a rectangle? ${parallelogram.isRectangle()}")
}