package philipplackner.oop

import philipplackner.oop.`class`.Circle
import philipplackner.oop.`class`.Rectangle
import philipplackner.oop.inheritance.Shape
import philipplackner.oop.inheritance.Triangle

fun main() {
    val rec = Rectangle(5.0)
    val circle = Circle(3.0)
    val triangle = Triangle(7.0, 7.0, 7.0)

    val maxAreaRectAndCircle = maxArea(rec, circle)
    val maxAreaRectCircleAndTriangle = maxArea(rec, circle, triangle)
    println("the maximum area of the rectangle and the circle is $maxAreaRectAndCircle")
    println("the maximum area of the rectangle, the circle and triangle is $maxAreaRectAndCircle")
}

fun maxArea(shape1: Rectangle, shape2: Circle): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if (areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Rectangle, shape2: Circle, shape3: Shape): Double {
    val maxAreaShape1Shape2 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}
