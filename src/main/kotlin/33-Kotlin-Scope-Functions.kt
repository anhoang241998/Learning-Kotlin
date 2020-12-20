private var number: Int? = null
private var i = 5

fun main() {
    // null check : let
//    if (number != null) {
//        val number2 = number + 1
//    }
    val x = number?.let {
        val number2 = it + 1
        number2
    } ?: 3
    println(x)

    // also
    println(getSquaredI())
    println(getSquaredI2())

    // apply: modify object
    val string = StringBuilder().apply {
        append("a")
        append("b")
        append("c")
        "sadasd"
    }
    println(string)

    // run
    val string1 = StringBuilder().run {
        append("a")
        append("b")
        append("c")
        "sadasd"
    }
    println(string1)
}

fun getSquaredI() = (i * i).also {
    i++
}

fun getSquaredI2() = (i * i).let {
    i++
}