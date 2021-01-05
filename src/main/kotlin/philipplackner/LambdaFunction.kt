package philipplackner

import philipplackner.oop.`class`.Circle
import philipplackner.oop.`class`.Rectangle
import philipplackner.oop.inheritance.Shape
import philipplackner.oop.inheritance.Triangle

fun main() {
    var list = (1..20).toList()
    println(list)
    list = list.filter {
        it > 8
    }

    println(list)

    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0, 4.0, 4.0)
    val triangle2 = Triangle(3.0, 3.0, 3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0, 3.0)

    var shapes = listOf(
        circle1,
        circle2,
        triangle1,
        triangle2,
        rectangle1,
        rectangle2
    )
    shapes = shapes.customFilter { shape, _ -> shape.area() > 20.0 }.sortedBy { it.area() }
    for (shape in shapes) {
        println("${shape.name}: Area = ${shape.area()}")
    }

    val x = doSomething(listOf(3, 4, 2, 8, 2, 4, 6, 0, 9)) {
        it % 2 == 0
    }
    println(x)

}

fun List<Shape>.customFilter(filterFunction: (Shape, String) -> (Boolean)): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape, "Hello")) {
            resultList.add(shape)
        }
    }
    return resultList
}

fun doSomething(list: List<Int>, function: (Int) -> Boolean): Int {
    for(i in list.size - 1 downTo 0) {
        if(function(list[i])) {
            return list[i]
        }
    }
    return -1
}
