package philipplackner

fun main() {
    var integers = (1..10).toList()
    integers.customFilter1 { it > 5 }
    var triple = Triple(1, "one", true)

    var customTriple = CustomTriple(3, "hello", true)
    customTriple.printTypes()

    val list1 = mutableListOf(1, 2, 3)
    val list2 = listOf(1, 2, 3)

    println(doSomething1(4))


}

fun <T> List<T>.customFilter1(filterFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filterFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}

fun doSomething1(x: Int): List<Int> {
    val list = mutableListOf<Int>()
    var bool = false
    for (i in 2..x) {
        for (j in 2 until i) {
            if (i % j == 0) {
                bool = true
            }
        }
        if (!bool) {
            list.add(i)
        }
        bool = false
    }
    return list
}

