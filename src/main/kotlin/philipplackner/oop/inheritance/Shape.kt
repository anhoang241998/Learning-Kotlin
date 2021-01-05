package philipplackner.oop.inheritance

abstract class Shape(
    var name: String
){

    constructor(
        name: String,
        vararg dimensions: Double
    ) : this(name)

    init {
        println("I am the super class")
    }

    constructor(email: Int = 0) : this(email.toString())

    abstract fun area(): Double

    abstract fun perimeter(): Double

    fun changeName(newName: String) {
        name = newName
    }
}