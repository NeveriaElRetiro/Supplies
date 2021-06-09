package mx.neveriaelretiro.supplies.model

class ProductProvider {
    companion object{

        fun productList(): List<ProductModel> {
            return productsLocal
        }

        private val productsLocal = listOf<ProductModel>(
            ProductModel("Fresa"),
            ProductModel("Vaso termico 32")
        )
    }
}