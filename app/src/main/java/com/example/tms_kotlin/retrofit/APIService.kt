package com.example.tms_kotlin.retrofit

import com.example.tms_kotlin.retrofit.models.Data
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIService {

    @GET("films/")
    suspend fun getFilms(): Response<Data>

    companion object {

        val BASE_URL = "https://swapi.dev/api/"
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun getInstance() = retrofit.create(APIService ::class.java)
    }

}