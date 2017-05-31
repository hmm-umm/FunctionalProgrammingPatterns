package kotlinex.flyweight.old

class CompFactory private constructor(){
    var typeMap = hashMapOf<String, Computer>()

    init {
        typeMap.put("macbook", Laptop())
        typeMap.put("sun", Desktop())
    }

    private object Holder {val INSTANCE = CompFactory()}

    companion object{
        val instance: CompFactory by lazy { Holder.INSTANCE }
    }

    fun ofType(computerType: String) : Computer? {
        return typeMap.get(computerType)
    }
}