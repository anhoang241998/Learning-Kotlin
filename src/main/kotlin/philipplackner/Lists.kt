package philipplackner

fun main() {
    val array = arrayOf(1, 2, 3)
    val list = mutableListOf(1, 2, 3)

//    list.add(4)
    list.removeAt(2)
    println(list)

    val emptyList = mutableListOf<Any?>()
    for (i in 1..10) {
        val x = readLine()?.toInt()
        if (x != null)
            emptyList.add(x)
    }
    println(emptyList)

    println(doHomework())
    println(doHardHomework())
}

private fun doHomework(): List<Int> {
    println("Please enter 5 numbers: ")
    val reverseList = mutableListOf<Int>()
    for (i in 1..5) {
        val inputNumber = readLine()?.toInt()
        if (inputNumber != null)
            reverseList.add(inputNumber)
    }
    reverseList.reverse()
    return reverseList
}

private fun doHardHomework(): MutableList<Int> {
    println("Please enter a number n > 1: ")
    val fibonacciList = mutableListOf(0, 1)
    val inputNumber = readLine()?.toInt()
    if (inputNumber != null) {
        for (i in 2 until inputNumber) {
            fibonacciList.add(fibonacciList[i - 2] + fibonacciList[i - 1])
        }
    }
    return fibonacciList
}