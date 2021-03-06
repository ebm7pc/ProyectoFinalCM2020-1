package co.edu.udea.compumovil.gr04_20201.proyectoFinal.domain

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitFactory {

    //--
    private const val BASE_URL = "https://my-json-server.typicode.com/leonel1221/Lab4db/"

    private val gson: Gson = GsonBuilder()
        .setLenient()
        .create()

    private fun retrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()


    fun postService(): PostsService = retrofit().create(PostsService::class.java)
}