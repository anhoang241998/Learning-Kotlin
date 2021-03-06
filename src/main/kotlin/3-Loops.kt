fun main() {
    // for loops
    // for each
    val names = listOf("Anne", "Peter", "Jeff")
    for (name in names) {
        print("name of each people ${name}, ")
    }

    println()

    // tang dan
    for (item in 1..10) {
        print("$item ->")
    }

    println()

    for (item in 1 until 10) {
        print("$item ->")
    }

    println()

    val number = 1..10
    for (item in number) {
        print("$item ->")
    }

    println()

    // giam dan
    for (item in 10 downTo 1) {
        print("$item ->")
    }

    println()

    // buoc nhay
    for (item in 1..10 step 2) {
        print("$item ->")
    }

    println()

    // While and Do/While
    //while
    var item = 10
    while (item < 15) {
        print("$item -> ")
        item++
    }

    println()

    // Do/while
    var item1 = 100
    do {
        print("$item1 -> ")
        item1++
    } while (item1 < 115)

    println()

    // thoat vong lap for
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i <=> j = $j")
            if (j > i) {
                break@loop
            }
        }
        println("i = $i")
    }

}