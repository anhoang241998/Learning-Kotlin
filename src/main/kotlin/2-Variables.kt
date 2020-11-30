fun main() {
//    Mutable and Immutable

    // mutable
    var email: String = "an241998@gmail.com"
    email = "code4func@gmail.com"
    println(email)

    // immutable
    val name: String = "Nguyen Hoang An"
//    name = "Nguyen Van Tan"
    println(name)

    // numeric type in Kotlin
    // Int
    val intNumber: Int  = 10
    println(intNumber)

    // Short
    val shortNumber: Short  = 10
    println(shortNumber)

    // Long
    val longNumber: Long  = 10L
    println(longNumber)

    // Double
    val doubleNumber: Double  = 10.2
    println(doubleNumber)

    // Float
    val floatNumber: Float  = 10F
    println(floatNumber)

    // Byte
    val byteNumber: Byte = 0x10
    println(byteNumber)

    // Char
    val characterType = 'A'
    println(characterType)

    // String
    var stringType = "Nguyen Hoang An"
    // concatenation
    stringType += " is 24 years old"
    // multiple lines
    stringType += """
         and handsome too hehe.
        <3 for this developer
    """.trimIndent()
    // interpolation string
    stringType += """
        
        This developer is having ${1} cuteee girlfriend 
    """.trimIndent()

    println(stringType)

}