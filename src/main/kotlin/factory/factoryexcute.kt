package kotlinex.factory

import kotlinex.factory.new.ProductFactoryK
import kotlinex.factory.old.Product
import kotlinex.factory.old.ProductFactory

fun main(args: Array<String>) {
    println("====== old ======")
    val product: Product? = ProductFactory.createProduct("loan")
    println("product :: ${product}")

    println("====== new ======")
    val productK: Product? = ProductFactoryK.createProduct("bond")?.invoke()
    println("productK :: ${productK}")

}