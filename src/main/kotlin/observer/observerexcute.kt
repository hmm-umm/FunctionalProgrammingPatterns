package kotlinex.observer

import kotlinex.observer.new.FeedK
import kotlinex.observer.new.ObserverFactory
import kotlinex.observer.old.Feed
import kotlinex.observer.old.Guardian
import kotlinex.observer.old.NYTimes

fun main(args: Array<String>) {

    println("====== old ======")
    val feed: Feed = Feed()
    feed.registerObserver(NYTimes())
    feed.registerObserver(Guardian())
    feed.notifyObservers("The queen said her favorite book is kotlin in action")

    println("====== NEW ======")
    val feedK: FeedK<String, Unit> = FeedK()
    feedK.registerObserverK(ObserverFactory.NYTimesK)
    feedK.registerObserverK(ObserverFactory.GuardianK)
    feedK.registerObserverK { tweet -> tweet?.apply { if(contains("book")) println("Breaking news in BOOKTimes") } }
    feedK.notifyObserversK("The queen said her favorite book is kotlin in action")
}