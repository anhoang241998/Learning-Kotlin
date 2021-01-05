package philipplackner

fun main() {
    var integers = (1..10).toList()
    integers.customFilter1 { it > 5 }
    var triple = Triple(1, "one", true)

    var customTriple = CustomTriple(3, "hello", true)
    customTriple.printTypes()

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

