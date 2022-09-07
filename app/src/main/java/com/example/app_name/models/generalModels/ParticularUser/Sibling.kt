package com.example.app_name.models.generalModels.ParticularUser

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Sibling {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("parent_id")
    @Expose
    var parentId: String? = null

    @SerializedName("nodeID")
    @Expose
    var nodeID: String? = null

    @SerializedName("gender")
    @Expose
    var gender: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("credentials_issued")
    @Expose
    var credentialsIssued: String? = null

    @SerializedName("credentials_revoked")
    @Expose
    var credentialsRevoked: String? = null

    @SerializedName("country")
    @Expose
    var country: String? = null

    @SerializedName("city")
    @Expose
    var city: String? = null

    @SerializedName("dob")
    @Expose
    var dob: String? = null

    @SerializedName("dob_calendar_type")
    @Expose
    var dobCalendarType: String? = null

    @SerializedName("profile_picture_square")
    @Expose
    var profilePictureSquare: String? = null

    @SerializedName("profile_picture_circle")
    @Expose
    var profilePictureCircle: String? = null

    @SerializedName("p_profile_picture")
    @Expose
    private var pProfilePicture: String? = null

    @SerializedName("p_dob")
    @Expose
    private var pDob: String? = null

    @SerializedName("p_mother_info")
    @Expose
    private var pMotherInfo: String? = null

    @SerializedName("contact")
    @Expose
    var contact: String? = null

    @SerializedName("contact_extension")
    @Expose
    var contactExtension: String? = null

    @SerializedName("mobile")
    @Expose
    var mobile: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("p_email")
    @Expose
    private var pEmail: String? = null

    @SerializedName("sequence")
    @Expose
    var sequence: String? = null

    @SerializedName("mother_name")
    @Expose
    var motherName: String? = null

    @SerializedName("m_father_name")
    @Expose
    private var mFatherName: String? = null

    @SerializedName("m_grand_father_name")
    @Expose
    private var mGrandFatherName: String? = null

    @SerializedName("branch")
    @Expose
    var branch: String? = null
    fun getpProfilePicture(): String? {
        return pProfilePicture
    }

    fun setpProfilePicture(pProfilePicture: String?) {
        this.pProfilePicture = pProfilePicture
    }

    fun getpDob(): String? {
        return pDob
    }

    fun setpDob(pDob: String?) {
        this.pDob = pDob
    }

    fun getpMotherInfo(): String? {
        return pMotherInfo
    }

    fun setpMotherInfo(pMotherInfo: String?) {
        this.pMotherInfo = pMotherInfo
    }

    fun getpEmail(): String? {
        return pEmail
    }

    fun setpEmail(pEmail: String?) {
        this.pEmail = pEmail
    }

    fun getmFatherName(): String? {
        return mFatherName
    }

    fun setmFatherName(mFatherName: String?) {
        this.mFatherName = mFatherName
    }

    fun getmGrandFatherName(): String? {
        return mGrandFatherName
    }

    fun setmGrandFatherName(mGrandFatherName: String?) {
        this.mGrandFatherName = mGrandFatherName
    }
}