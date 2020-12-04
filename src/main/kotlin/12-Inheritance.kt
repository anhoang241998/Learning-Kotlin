fun main() {
    var dog = Dog()
    println(dog.name)
    dog.talk()

    var cat = Cat()
    println(cat.name)
    cat.talk()
}

open class Animal(var name: String = "") {
    open fun talk() {}
}

class Dog: Animal() {
    init {
        this.name = "Dog"
    }

    override fun talk() {
        println("Gau gau")
    }
}

class Cat: Animal {
    init {
        this.name = "Cat"
    }

    constructor(name: String = ""): super(name)

    override fun talk() {
        println("meo meo")
    }
}

