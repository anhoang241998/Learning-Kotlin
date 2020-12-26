fun main() {
    val age by lazy {
        123
    }

    println(age)

    setName {
        handler()
    }

    val name by lazy {
        println("Computed")
        "Donn"
    }

    println(name)
    println(name)

}

fun handler() = "Code4func"

fun setName(handler: () -> String) {
    val name1 by lazy {
        handler
    }
}


