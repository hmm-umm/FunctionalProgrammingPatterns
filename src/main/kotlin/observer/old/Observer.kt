package kotlinex.observer.old

interface Observer {
    fun notify(tweet: String): Unit
}