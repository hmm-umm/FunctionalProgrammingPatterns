package kotlinex.strategy.new

class ValidatorFactory private constructor (){
    companion object {
                val allLowerValidator = { string: String -> string.matches(Regex("[a-z]+"))}
        val allLowerValidatorCurried = { string: String, regex: Regex -> string.matches(regex) }
        val numericValidator: (String) -> Boolean
            get() = { string: String -> string.matches(Regex("\\d+")) }
    }
}