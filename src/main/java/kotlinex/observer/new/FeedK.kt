package kotlinex.observer.new

class FeedK : SubjectK{
    val observersList = mutableListOf<(String) -> Unit>()

    override fun registerObserverK(func: (String) -> Unit) {
        observersList.add(func)
    }

    override fun notifyObserversK(tweet: String) {
        observersList.stream().forEach {
            func -> func(tweet)
        }
    }
}