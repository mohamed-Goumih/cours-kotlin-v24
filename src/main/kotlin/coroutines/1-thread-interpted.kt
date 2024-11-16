fun main() {
    val interruptibleThread = Thread {
        try {
            Thread.sleep(10000)
        } catch (e: InterruptedException) {
            println("Thread was interrupted!")
        }
    }
    println(interruptibleThread.isInterrupted)

}