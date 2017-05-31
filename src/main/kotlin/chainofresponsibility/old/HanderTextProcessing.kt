package kotlinex.chainofresponsibility.old

class HanderTextProcessing : ProcessingObject<String>(){
    override fun handleWork(input: String): String {
        return "From Raoul, Mario and Alan: ${input}"
    }
}