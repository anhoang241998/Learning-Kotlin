fun main() {
    // Generic
    var code4Func1 = Code4FuncRepo<X>()
    code4Func1.insert(X())

    var code4Func2 = Code4FuncRepo<Y>()
    code4Func2.insert(Y())

    var x = createInstance(X())
    var y = createInstance(Y())

    println(x.toString())
    println(y.toString())


}

// T = type
// E = element
// R = return
class Code4FuncRepo<T> {
    fun insert(rc: T) {
        println("insert ${rc.toString()} ok")
    }
}

fun <T>createInstance(o: T) : T {
    return o
}

data class X(val name: String = "XXX")
data class Y(val name: String = "YYY")

class Circle(radius: Int) {

}