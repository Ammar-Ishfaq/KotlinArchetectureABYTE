package com.example.app_name.api

import com.example.app_name.backend.MyAPICall
import com.example.app_name.backend.MyCustomApp
import com.example.app_name.util.safeApiCall
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SharedWebService(
    private val apiServices: MyAPICall,
    private val app: MyCustomApp
) {

    /**
     * Newly implementation of the new architecture ie here
     */
    private val dispatcher = Dispatchers.IO

    suspend fun getAllUserList() = withContext(dispatcher) {
        safeApiCall {
            Result.success(apiServices.getAllUser())
        }
    }

    suspend fun getParticularUserById(id: Int) = withContext(dispatcher) {
        safeApiCall {
            Result.success(apiServices.getParticularUserById(id))
        }
    }
}