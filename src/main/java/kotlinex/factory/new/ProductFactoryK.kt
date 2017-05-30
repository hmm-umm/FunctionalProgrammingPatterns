package kotlinex.factory.new

import kotlinex.factory.old.Bond
import kotlinex.factory.old.Loan
import kotlinex.factory.old.Product
import kotlinex.factory.old.Stock

class ProductFactoryK private constructor() {
    companion object {
        val mapData = hashMapOf<String, ()->Product>()

        init {
            mapData.put("loan", {Loan()})
            mapData.put("stock", {Stock()})
            mapData.put("bond", {Bond()})
        }

        fun createProduct(name: String): (() -> Product)? {
            var value : (() -> Product)? = null
            name?.let{
                value = mapData?.get(it)
            }

            return value
        }
    }
}