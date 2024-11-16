fun main() {
    val thread = Thread {
        println("Thread is running: ${Thread.currentThread().name}")
    }
    val thread2 = Thread {
        println("Thread is running: ${Thread.currentThread().name}")
    }

    val thread3 = Thread({
        Thread.sleep(1000)
        println("Thread is running: ${Thread.currentThread().name}")
    }, "Thread2")
    thread.start()
    thread2.start()
    thread3.start()
}