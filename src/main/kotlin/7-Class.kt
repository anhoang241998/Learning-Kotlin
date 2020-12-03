fun main() {

    var student = Student()
    println(student.age)
    println(student.name)

    println("=====")
    student.showInfo()

    println("==CUSTOMER==")
    val customer = Customer(email = "Ryan@gmail.com")
    customer.email = "alice@gmail.com "
    customer.showInfoCustomer()
}

class Student {
    // properties, method
    var name = "Ryan Nguyen"
    var age = 25

    fun showInfo() {
        println(this.name)
        println(this.age)
    }
}

class Customer(var name: String = "", var phone: String = "") {

    var email: String = ""
        set(newEmail) {
            field = newEmail + "<===>"
        }
        get() = field

    init {
        name = "Code4func"
        phone = "090909090"
    }

    // secondary constructor
    constructor(email: String): this() {
        this.email = email
    }

    fun showInfoCustomer() {
        println(this.name)
        println(this.phone)
        println(this.email)
    }
}