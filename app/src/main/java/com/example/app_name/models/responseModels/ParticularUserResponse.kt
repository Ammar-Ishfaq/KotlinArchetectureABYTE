package com.example.app_name.models.responseModels

import com.example.app_name.models.generalModels.ParticularUser.Data
import com.example.app_name.models.utilityModels.BaseResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ParticularUserResponse(
    @SerialName(value = "Data")
    val Data: Data

) : BaseResponse()