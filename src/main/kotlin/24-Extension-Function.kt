fun main() {

    var password: String? = "1234567"
    // >6, >8
    var result = password?.validatePass()
    println(result)

    var library = Library()
    library.anOtherFunction()
}

fun String.validatePass(): Boolean {
    return if (this.isEmpty()) false
    else this.length > 6
}

class Library {

}

fun Library.anOtherFunction() {
    println("anOtherFunction")
}

