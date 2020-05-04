package com.example.registerapp.network


import com.example.registerapp.register.data.ResultRegister
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RegisterService {

    @FormUrlEncoded
    @POST("registerUser")
    fun register(
        @Field("nama") nama : String,
        @Field("email") email : String,
        @Field("hp") hp : String,
        @Field("password") password : String
    ) : Call<ResultRegister>
}