package kotlinex.factory.old

class ProductFactory private constructor() {
    companion object{
        fun createProduct(name: String) : Product? {
            var product: Product? = null
            when (name) {
                "loan" -> product = Loan()
                "stock" -> product =  Stock()
                "bond" -> product = Bond()
            }

            return product
        }
    }
}