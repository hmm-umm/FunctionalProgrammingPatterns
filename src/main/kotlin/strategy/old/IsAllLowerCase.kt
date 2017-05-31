package kotlinex.strategy.old

class IsAllLowerCase : ValidationStrategy {
    override fun execute(string: String): Boolean {
        return string.matches(Regex("[a-z]+"))
    }
}