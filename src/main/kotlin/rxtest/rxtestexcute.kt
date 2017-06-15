package kotlinex.rxtest

import io.reactivex.functions.Consumer
import io.reactivex.processors.PublishProcessor

fun main(args: Array<String>) {
    println("====== rxtest ======")

    var subject = PublishProcessor.create<String>()

    var sourceObservable = subject.toObservable()

    var stringObservable = sourceObservable.publish() // change hot stream


//    var stringObservable = sourceObservable.publish().refCount()
//    var stringObservable = sourceObservable.share()

    stringObservable.connect() //start stream

    stringObservable.subscribe(Consumer { t ->  println("result 2 :: " + t)})
    stringObservable.subscribe(Consumer { t ->  println("result 1 :: " + t)})


    subject.onNext("A")
    subject.onNext("B")
    subject.onNext("C")



    subject.onComplete()
}