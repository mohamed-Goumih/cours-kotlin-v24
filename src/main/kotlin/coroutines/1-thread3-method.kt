import kotlin.concurrent.thread

fun main() {
    val th=thread(start = true, name = "ConciseThread") {
        println("Thread is running: ${Thread.currentThread().name}")
    }
    println( th.isAlive)
    println( th.id)
    println( th.name)




}