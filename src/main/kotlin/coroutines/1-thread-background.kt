import kotlin.concurrent.thread

fun main() {
    //Main Thread
    println("Main Thread démarre :${Thread.currentThread().name}")

    //background thread
    thread{
        Thread.sleep(1000)
        println("background thread démarre")
        Thread.sleep(1000)
        println("Telechargement démarre 0%...")
        Thread.sleep(2000)
        println("Telechargement en cours: 50%...")
        Thread.sleep(2000)
        println("Telechargement complete 100%")
        println("background thread termine")
    }
    println("Main Thread termine :${Thread.currentThread().name}")

}