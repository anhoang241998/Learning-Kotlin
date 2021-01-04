package philipplackner

fun main() {
    val array = intArrayOf(20, 25, 30)
    val max = getMax(1, 2, 3, 7, *array, 8, 1, 29, 39, 1210, 99999)
    println("the maximum is $max")

    searchFor(searchEngine = "Google")
    searchFor(searchEngine = "Bing")


}

fun searchFor(
    search: String = "Linh",
    searchEngine: String
) {
    println("Searching for $search on $searchEngine")
}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun doSomething(vararg numbers: Int, numberToFind: Int): Boolean {
    for(number in numbers) {
        if(number == numberToFind) {
            return true
        }
    }
    return false
}

