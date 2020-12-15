fun main() {
    printNumber()
}

inline fun <T> Iterable<T>.customForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}
fun printNumber() {
    val range = 0..20
    range.customForEach {
        if (it == 9) {
            return@customForEach // continue
        }
        println(it)
    }
    println("end")

    println("======")
    println("======")

    val newRange = 0..10
    newRange.forEach(fun(item: Int): Unit {
        if (item == 9) {
            return
        }
        println(item)
    })
}