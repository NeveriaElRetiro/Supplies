package mx.neveriaelretiro.supplies.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.neveriaelretiro.supplies.model.ProductModel
import mx.neveriaelretiro.supplies.model.ProductProvider

class ProductViewModel: ViewModel() {

    val productModel = MutableLiveData<ProductModel>()

    fun getProducts(){
        val currentProductsList = ProductProvider.productList()
        //productModel.postValue(currentProductsList)
    }
}