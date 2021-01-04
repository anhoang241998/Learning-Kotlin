package philipplackner

fun main() {
    println("Please enter a number")

    println("${readLine()?.toInt()?.isPrime()}")
}

fun Int.isPrime(): Boolean {

    for (i in 2 until this - 1) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}