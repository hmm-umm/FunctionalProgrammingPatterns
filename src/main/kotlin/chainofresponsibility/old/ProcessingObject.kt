package kotlinex.chainofresponsibility.old

abstract class ProcessingObject<T> {
    protected var  successor: ProcessingObject<T>? = null

    fun setSuccesor(successor: ProcessingObject<T>) {
        this.successor = successor
    }

    fun handle(input: T): T{
        val relate: T = handleWork(input)
        return successor?.handle(relate)?:relate
    }

    abstract fun handleWork(input: T): T
}