import kotlinx.coroutines.*
import java.lang.Exception

fun main() {
//    demoLaunch1()
//    demoLaunch2()
//    GlobalScope.launch {
//        var res = demoAsync()
//        println(res)
//    }
//    demo3()
    demo4()
    Thread.sleep(4000L)
}

fun demoLaunch1() {
    GlobalScope.launch(Dispatchers.Main) {
        delay(1000L)
        println("World")
    }
    println("Hello ")
    Thread.sleep(2000L)
}

fun demoLaunch2() {
    GlobalScope.launch {
        println("start Job")

        var res1 = async(Dispatchers.IO) {
            callHttp()
        }
        var res2 = async {
            callHttp()
        }

        println("end job")
        println("${res1.await()} <-> ${res2.await()}")
    }
    Thread.sleep(4000L)
}

fun callHttp(): Int {
    Thread.sleep(2000L)
    return 200
}

suspend fun demoAsync(): Int {
    var result = GlobalScope.async {
        callHttp()
    }
    return result.await()
}

fun demo3() {
    GlobalScope.launch(handler) {
        funcWithException()
    }
}

fun funcWithExceptionAsync(): Int {
    return 10 / (0..1).random()
}

val handler = CoroutineExceptionHandler { _, exp ->
    println("ERROR -> ${exp.toString()}")
}

fun funcWithException(): Nothing {
    throw Exception("loi roi")
}

fun demo4() {
    GlobalScope.launch() {
        async {
            try {
                funcWithExceptionAsync()
            } catch (e: Exception) {
                println(">>> ${e.toString()}")
            }
        }
    }
}