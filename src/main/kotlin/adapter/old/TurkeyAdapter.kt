package adapter.old

class TurkeyAdapter(val turkey: Turkey): Duck{
    override fun quack() {
        println("TurkeyAdapter quack")
        turkey.gobble()
    }

    override fun fly() {
        println("TurkeyAdapter fly")
        turkey.fly()
    }
}