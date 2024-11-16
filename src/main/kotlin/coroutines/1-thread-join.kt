fun main() {
    val joinableThread = Thread {
        Thread.sleep(3000)
        println("Thread completed!")
    }
    joinableThread.start()
    joinableThread.join()
    println("Main thread continues after joinableThread completes.")

}