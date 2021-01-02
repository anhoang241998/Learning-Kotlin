import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        task2()
    }
    task1()
    Thread.sleep(2000L)
}

fun task1() {
    println("Hello ")
    println(Thread.currentThread().name)
}

suspend fun task2() {
    withContext(Dispatchers.IO) {
        delay(1000L)
        println("World")
        println(Thread.currentThread().name)
    }
}