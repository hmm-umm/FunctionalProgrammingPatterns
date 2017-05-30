package kotlinex.observer.old

class NYTimes : Observer{
    override fun notify(tweet: String) {
        tweet?.apply {
            if(contains("money")) println("Breaking news in NY")
        }
    }
}