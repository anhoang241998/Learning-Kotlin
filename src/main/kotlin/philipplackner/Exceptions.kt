package philipplackner

import java.lang.Exception

fun main() {
    val division = try {
        divide(5.0, 0.0)
    } catch (e: Exception) {
        println(e.toString())
    }

    println("the result of the division is $division")

    println("Please enter a number: ")
    val input = try {
        readLine()?.toInt()
    } catch (e: Exception) {
        println(e.toString())
    } finally {
        println("This is from the finally block")
    }

    println("you entered: $input")

}

class DivisionByZeroException(mes: String) : Exception(mes)

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw DivisionByZeroException("You cannot divide by zero. Please choose a different number")
    }
    return a / b
}