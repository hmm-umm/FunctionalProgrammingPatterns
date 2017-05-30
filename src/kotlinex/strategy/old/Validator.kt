package kotlinex.strategy.old

class Validator (val validateStrategy: ValidationStrategy) {
    fun validate(string: String): Boolean {
        return validateStrategy.execute(string);
    }
}