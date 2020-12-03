fun main() {
    println("==CUSTOMER==")
    val customer = NewCustomer(email = "Ryan@gmail.com")
    customer.sName("alice@gmail.com ")
    customer.showInfoCustomer()
    setLang()
//    getLang()
}

open class Person {
    protected var fullName = ""
}

class NewCustomer(var name: String = "", var phone: String = ""): Person() {

    private var email: String = ""
        set(newEmail) {
            field = newEmail + "<===>"
        }
        get() = field

    fun sName(newEmail: String) {
        this.email = newEmail
    }

    init {
        name = "Code4func"
        phone = "090909090"
    }

    // secondary constructor
    constructor(email: String) : this() {
        this.email = email
    }

    fun showInfoCustomer() {
        println(this.name)
        println(this.phone)
        println(this.email)
        fullName
    }
}

