import java.lang.Exception

fun main() {

    try {
        var float = 10 / (0..1).random()
        println(float)
    } catch (e: Exception) {
        println(e.toString())
    } finally {
        println("Done")
    }

    var value = try {
        val value = 10 / 1
        value
    } catch (e: Exception) {
        println(e.toString())
    }
    println("my value is $value")

    try {
        var number = parseInt("Hello world")
        println(number)
    } catch (e: Exception) {
        println(e.toString())
    }

    var result = try {
        var number1 = parseFloat(123)
        println(number1)
        "thanh cong"
    } catch (e: CustomException) {
        println(e.toString())
        "fail"
    }

    println(result)

    println("end program")
}

fun parseInt(s: String): Int = s.toInt()

fun parseFloat(s: Any): Float {
    if (s is Int) {
        throw CustomException("Loi ne")
    }
    var str = s as String
    return str.toFloat()
}


class CustomException(mes: String) : Throwable(mes) {

}