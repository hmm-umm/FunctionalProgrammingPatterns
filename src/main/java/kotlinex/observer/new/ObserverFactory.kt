package kotlinex.observer.new

class ObserverFactory {
    companion object{
        val NYTimesK: (String) -> Unit
            get() = {tweet: String -> tweet?.apply {
                if(contains("money")) println("Breaking news in NY") }
            }

        val GuardianK: (String) -> Unit
            get() = {tweet: String -> tweet?.apply {
                if(contains("queen")) println("Breaking news in Guardian")}
            }
    }
}