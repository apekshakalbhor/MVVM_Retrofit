package com.example.mvvm_retrofit.api

import com.example.mvvm_retrofit.constant
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {

    companion object {
        fun getInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }


}