package com.example.app_name.models.generalModels.ParticularUser

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ParticularPerson {
    @SerializedName("Exceptions")
    @Expose
    var exceptions: String? = null

    @SerializedName("Status")
    @Expose
    var status: Int? = null

    @SerializedName("ResultType")
    @Expose
    var resultType: Int? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data: Data? = null
}