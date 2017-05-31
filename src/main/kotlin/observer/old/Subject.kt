package kotlinex.observer.old

interface Subject {
    fun registerObserver(observer: Observer): Unit
    fun notifyObservers(tweet: String): Unit
}