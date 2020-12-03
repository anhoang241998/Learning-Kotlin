fun main() {

    var singleton1 = SingletonKotlin
    var singleton2 = SingletonKotlin
    println(singleton1 == singleton2)

    var guru1 = Guru()
    var guru2 = Guru()
    println(guru1 == guru2)

    println(SingletonKotlin.name) // static
    println(SingletonKotlin.doSomething()) // static


//    println(Guru.PI) // public static final float PI = 3.14
    var guru3 = Guru.makeGuru1()
    var guru4 = Guru.makeGuru2()
}



class Guru {

    companion object Factory {
        var name = "abc"
        fun makeGuru1() = Guru()

        fun makeGuru2() = Guru()
    }

    fun makeSomethingWoaw() {

    }
}

object SingletonKotlin {

    var name = "Kotlin"
    fun doSomething() {

    }
}