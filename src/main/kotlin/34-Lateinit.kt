fun main() {
    // lateinit
    val baby = MyBaby()
    baby.name = "hello world"
    baby.showName()
}

class MyBaby {
    lateinit var name: String

    fun showName() {
        println(name)
    }
}