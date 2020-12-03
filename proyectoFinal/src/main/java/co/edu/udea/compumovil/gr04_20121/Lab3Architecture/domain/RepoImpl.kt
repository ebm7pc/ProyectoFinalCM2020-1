package co.edu.udea.compumovil.gr04_20121.Lab3Architecture.domain

import co.edu.udea.compumovil.gr04_20121.Lab3Architecture.model.DataSource
import co.edu.udea.compumovil.gr04_20121.Lab3Architecture.model.Product
import co.edu.udea.compumovil.gr04_20121.Lab3Architecture.valueObjet.Resource

class RepoImpl(private val dataSource: DataSource): Repo {
    override fun getProductList(): Resource<List<Product>> {
        return dataSource.generateProductList
    }
}