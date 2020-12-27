package philipplackner

fun main() {
    val x = 3
    printThreeLines()
    printPow(3, 5)
    printSum(1, 5)
    doSomething("Nguyen")

    val pow = printPow1(3, 5)
    println("3 to the power of 5 is $pow")
    printIndex()

}

private fun printIndex() {
    val list = mutableListOf(readLine()?.toInt())
    println("the list loooks like the following: $list")
    println("Search for this number: ")
    val value = readLine()?.toInt()

}

private fun printPow(
        base: Int,
        exponent: Int) {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is $result")
}
private fun printPow1(
        base: Int,
        exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is $result")
    return result
}


private fun printSum(
        base: Int,
        sum: Int) {
    var result = 0
    for (i in base..sum) {
        result += i
    }
    println("the sum of the values from $base to $sum is $result")
}

private fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}

fun doSomething(x: String) {
    val list = mutableListOf<Char>()
    for(c in x) {
        list.add(c)
    }
    for(c in list.reversed()) {
        println(c)
    }
}

fun doSomething(x: Int): Int {
    return when(x) {
        in 0..3 -> 0
        in 4..5 -> 1
        6 -> 2
        in 7..100000 -> 3
        else -> {
            122
        }
    }
}