import java.lang.Exception

fun main() {
    sayHello()
    sayHello1()
    val age = getAge()
    println(age)

    val sum = sum(1, 2)
    println(sum)

    val sum1 = sum1(3, 4)
    println(sum1)

//    val statusCode = callApi()
//    if (statusCode == 400) {
//        error("Bad Request")
//        showErrorUI()
//    }

    println("Sum2: ${sum2(1, 2, 3, 4, 5, 6)}")
    printSum(2, 3, 4)
    showInfo(email = "ryan@gmail.com", fullName = "Nguyen Hoang An", age = 25)
    showInfo()
}

fun callApi(): Int = 400
fun showErrorUI() = println("show Error UI Function")

// cach tao function trong kotlin
fun sayHello() {
    println("inside sayHello function")
}

// cach tao function void torng kotlin
fun sayHello1(): Unit {
    println("inside sayHello function return void or unit")
}

// function return type
fun getAge(): Int {
    return 25
}

// truyen tham so vao function
fun sum(x: Int, y: Int): Int {
    return x + y
}

// function chi co 1 dong
fun sum1(x: Int, y: Int): Int = x + y

// demo return nothing
fun error(message: String): Nothing {
    throw Exception(message)
}

// Unlimited parameter case 1
fun sum2(vararg ints: Int): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

// Unlimited parameter case 2
fun printSum(vararg ints: Int) {
    val sum = sum2(*ints)
    println("print sum = $sum")
}

// named and default
fun showInfo(email: String = "an2419998@gmail.com", fullName: String = "Nguyen Hoang An", age: Int = 25) {
    println(email)
    println(fullName)
    println(age)
}
