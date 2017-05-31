package kotlinex.observer.old

class Guardian : Observer{
    override fun notify(tweet: String) {
        tweet?.apply {
            if(contains("queen")) println("Breaking news in Guardian")
        }
    }
}