package philipplackner

fun main() {
    when (readLine()?.toInt()) {
        in 0..5 -> {
            println("you are a young kid")
        }
        in 6..17 -> {
            println("you are a teenager")
        }
        18 -> {
            println("Finally, you are 18!")
        }
        19, 20 -> {
            println("you are a young adult")
        }
        in 21..65 -> {
            println("you are an adult")
        }
        else -> {
            println("you are really old")
        }
    }
    val homework =
            when(readLine()) {
                "USA" -> {
                    "hello"
                }
                "India" -> {
                    "namaste"
                }
                "Germany" -> {
                    "Hallo"
                }
                "Russia" -> {
                    "privet"
                }
                else -> {
                    "I don't know that"
                }
            }
    println(homework)

    val x = readLine()
    if(x != null) {
        val y = when(x.toInt()) {
            in 0..3 -> 1
            in 4..8 step 3 -> 2
            7 -> 3
            in 8..12 -> 4
            else -> 5
        }
        println(y)
    }
}