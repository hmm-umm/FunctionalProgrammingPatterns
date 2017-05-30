package kotlinex.observer.new

interface SubjectK<T, R> {
    fun registerObserverK(func : (T) -> R)
    fun notifyObserversK(tweet: T)
}