package com.example.app_name.backend

import com.example.app_name.models.responseModels.DatumListResponse
import com.example.app_name.models.responseModels.ParticularUserResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface MyAPICall {

    @GET("api/familymembers")
    suspend fun getAllUser(): DatumListResponse

    @GET("api/familymembers/{ID}")
    suspend fun getParticularUserById(@Path("ID") ID: Int): ParticularUserResponse

}