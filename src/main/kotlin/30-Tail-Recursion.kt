fun main() {
    println(fibonacciV1(10))
    println(fibonacciV2(10))
}

fun fibonacciV1(i: Int): Int {
    if (i == 0 || i == 1) {
        return i
    }
    return fibonacciV1(i - 1) + fibonacciV1(i - 2)
}

//tail recursive functions
tailrec fun fibonacciV2(i: Int, a: Int = 0, b: Int = 1): Int =
        when (i) {
            0 -> a
            1 -> b
            else -> fibonacciV2(i - 1, b, a + b)
        }

