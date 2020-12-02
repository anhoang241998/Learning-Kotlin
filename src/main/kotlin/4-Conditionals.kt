fun main() {
    // if-else, when
    // if-else
    val number = (1..100).random()
    println(number)

    if (number % 2 == 0) {
        println("$number chia het cho 2")
    } else {
        println("$number khong chia het cho 2")
    }

    // if-else long nha
    if (number % 4 == 0) {
        println("$number chia het cho 4")
    } else if (number % 5 == 0) {
        println("$number chia het cho 5")
    } else if (number % 6 == 0) {
        println("$number chia het cho 6")
    } else {
        println("$number khong chia het cho 4, 5, 6")
    }

    // if expression
    val numberA = 10
    val numberB = 11
    val result = if (numberA < numberB) {
        numberA
    } else {
        numberB
    }
    println("choose $result")

    // when <=> switch-case
    when(number) {
        in 1..16 -> {
            println("Chua du tuoi vi thanh nien")
        }
        18 -> {
            println("den tuoi lay vo")
        }
        in 19..100 -> {
            println("thich lam gi lam do")
        }
        else -> {
            println("Khong biet")
        }
    }

    // when expression
    val x = (1..10).random()
    val y = (1..10).random()
    val resultNew = when {
        x < y -> {
            "Gia tri $x nho hon $y"
        }
        x > y -> {
            "Gia tri $y nho hon $x"
        }
        else -> {
            "Gia tri $x bang gia tri $y"
        }
    }
    println(resultNew)

}