package com.example.app_name.models.responseModels

import com.example.app_name.models.generalModels.AllUsers.Datum
import com.example.app_name.models.utilityModels.BaseResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DatumListResponse(
    @SerialName(value = "Data")
    val Data: ArrayList<Datum>

) : BaseResponse()