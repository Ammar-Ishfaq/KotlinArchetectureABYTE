package com.example.app_name.models.generalModels.AllUsers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Education(
    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("level")
    @Expose
    var level: String? = null,

    @SerializedName("level_arabic")
    @Expose
    var levelArabic: String? = null,

    @SerializedName("institute")
    @Expose
    var institute: String? = null,

    @SerializedName("year")
    @Expose
    var year: String? = null,

    @SerializedName("program_title")
    @Expose
    var programTitle: String? = null,
)