package kotlinex.chainofresponsibility.old

class SpellCheckerProcessiong : ProcessingObject<String>() {
    override fun handleWork(input: String): String {
        return input?.replace("labda", "lambda")
    }
}