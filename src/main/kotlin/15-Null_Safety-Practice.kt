fun main() {
    val userInput = readLine()
    println("You entered $userInput")
    println(userInput?.toUpperCase())

    if (userInput != null) {
        println(userInput.toInt() - 5)
    }

    println("Please enter your age: ")
    val userAge = readLine()
    if (userAge != null)
        when (userAge.toInt()) {
            in 0..18 -> {
                println("You are not an adult")
            }
            in 19..60 -> {
                println("Your are an adult")
            }
            else -> {
                println("You are really old")
            }
        }

    val number1 = readLine()
    val number2 = readLine()
    val result = if(number1 != null) {
        if(number2 != null) {
            number1.toInt() + number2.toInt()
        } else {
            0
        }
    } else {
        -1
    }
    println(result)




}