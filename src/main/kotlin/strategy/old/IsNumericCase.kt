package kotlinex.strategy.old

class IsNumericCase : ValidationStrategy {
    override fun execute(string: String): Boolean {
        return string.matches(Regex("\\d+"))
    }
}