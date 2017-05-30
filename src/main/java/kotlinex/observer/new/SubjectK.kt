package kotlinex.observer.new

interface SubjectK {
    fun registerObserverK(func : (String) -> Unit): Unit
    fun notifyObserversK(tweet: String): Unit
}