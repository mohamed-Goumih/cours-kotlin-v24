import kotlin.concurrent.thread
import kotlinx.coroutines.*

fun main() {        // Executes in main thread

    println("Main program starts: ${Thread.currentThread().name}")

    thread {    // creates a background thread (worker thread)
        println("starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)      // Pretend doing some work... may be file upload
        println("finished: ${Thread.currentThread().name}")
    }

    println("Main program ends: ${Thread.currentThread().name}")
}