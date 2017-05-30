package kotlinex.strategy.old

interface ValidationStrategy {
    fun execute(string: String): Boolean
}