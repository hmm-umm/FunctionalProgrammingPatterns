package kotlinex.flyweight.new

import kotlinex.flyweight.old.Computer
import kotlinex.flyweight.old.Desktop
import kotlinex.flyweight.old.Laptop
import org.funktionale.memoization.memoize

class CompFactoryK {
    private val ofType : (typeName: String) -> Computer? = { typeName -> hashMapOf("macbook" to Laptop(), "sun" to Desktop()).get(typeName) }
//    val ofType = { typeName: String -> hashMapOf("macbook" to Laptop(), "sun" to Desktop()).get(typeName) }


    private object Holder {val INSTANCE = CompFactoryK() }

    companion object{
        val instance: CompFactoryK by lazy { Holder.INSTANCE }
    }
    val computerOfType = ofType.memoize()
//    val computerOfType = ofType.memoize<String, Computer?>()
}