package com.example.app_name.models.generalModels.ParticularUser

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Workplace {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("job_title")
    @Expose
    var jobTitle: String? = null

    @SerializedName("location")
    @Expose
    var location: String? = null
}