import kotlin.math.sqrt

fun main() {
    //Inline function
    println("start program")
    var total = sum(1, 2) { x, y ->
        x + y
    }
    println(total)

    var sqrt = squrt(4.0) {
        sqrt(it)
    }
    println(sqrt)
    println("end program")
}


inline fun sum(x: Int, y: Int, action: (Int, Int) -> Int) = action(x, y)
fun squrt(x: Double, action: (Double) -> Double) = action(x)