package kotlinex.observer.new

class FeedK<T, R> : SubjectK<T, R>{
    val observersList = mutableListOf<(T) -> R>()

    override fun registerObserverK(func: (T) -> R) {
        observersList.add(func)
    }

    override fun notifyObserversK(tweet: T) {
        observersList.stream().forEach {
            func -> func(tweet)
        }
    }
}