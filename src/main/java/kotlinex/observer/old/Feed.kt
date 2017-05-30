package kotlinex.observer.old

class Feed : Subject{

    val observers = mutableListOf<Observer>()

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun notifyObservers(tweet: String) {
        observers.stream().forEach { observer: Observer? ->  observer?.notify(tweet)}
    }
}