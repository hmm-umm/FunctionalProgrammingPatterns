package kotlinex.observer

import adapter.old.*

fun main(args: Array<String>) {

    println("====== old ======")
    val duck: Duck = MallardDuck()
    val turkey: Turkey = WildTurkey()
    val turkeyToDuckAdapter: Duck = TurkeyAdapter(turkey)
    println("old === duck === ${duck.fly()} :: ${duck.quack()}")
    println("old === turkey === ${turkey.fly()} :: ${turkey.gobble()}")
    println("old === turkeyToDuckAdapter === ${turkeyToDuckAdapter.fly()} :: ${turkeyToDuckAdapter.quack()}")

    println("====== NEW ======")

}