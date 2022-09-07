package com.example.app_name.models.generalModels.ParticularUser

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Child {
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

    @SerializedName("mother_name")
    @Expose
    var motherName: String? = null

    @SerializedName("m_father_name")
    @Expose
    private var mFatherName: String? = null

    @SerializedName("m_grand_father_name")
    @Expose
    private var mGrandFatherName: String? = null

    @SerializedName("p_mother_info")
    @Expose
    private var pMotherInfo: String? = null

    @SerializedName("p_wife_info")
    @Expose
    private var pWifeInfo: String? = null

    @SerializedName("p_dob")
    @Expose
    private var pDob: String? = null

    @SerializedName("p_location")
    @Expose
    private var pLocation: String? = null

    @SerializedName("p_email")
    @Expose
    private var pEmail: String? = null

    @SerializedName("p_mobile")
    @Expose
    private var pMobile: String? = null

    @SerializedName("p_landline")
    @Expose
    private var pLandline: String? = null

    @SerializedName("p_socialnetworks")
    @Expose
    private var pSocialnetworks: String? = null

    @SerializedName("p_workplace")
    @Expose
    private var pWorkplace: String? = null

    @SerializedName("p_education")
    @Expose
    private var pEducation: String? = null

    @SerializedName("p_profile_picture")
    @Expose
    private var pProfilePicture: String? = null

    @SerializedName("alive")
    @Expose
    var alive: String? = null

    @SerializedName("sequence")
    @Expose
    var sequence: String? = null

    @SerializedName("education")
    @Expose
    var education: List<Education>? = null
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

    fun getpMotherInfo(): String? {
        return pMotherInfo
    }

    fun setpMotherInfo(pMotherInfo: String?) {
        this.pMotherInfo = pMotherInfo
    }

    fun getpWifeInfo(): String? {
        return pWifeInfo
    }

    fun setpWifeInfo(pWifeInfo: String?) {
        this.pWifeInfo = pWifeInfo
    }

    fun getpDob(): String? {
        return pDob
    }

    fun setpDob(pDob: String?) {
        this.pDob = pDob
    }

    fun getpLocation(): String? {
        return pLocation
    }

    fun setpLocation(pLocation: String?) {
        this.pLocation = pLocation
    }

    fun getpEmail(): String? {
        return pEmail
    }

    fun setpEmail(pEmail: String?) {
        this.pEmail = pEmail
    }

    fun getpMobile(): String? {
        return pMobile
    }

    fun setpMobile(pMobile: String?) {
        this.pMobile = pMobile
    }

    fun getpLandline(): String? {
        return pLandline
    }

    fun setpLandline(pLandline: String?) {
        this.pLandline = pLandline
    }

    fun getpSocialnetworks(): String? {
        return pSocialnetworks
    }

    fun setpSocialnetworks(pSocialnetworks: String?) {
        this.pSocialnetworks = pSocialnetworks
    }

    fun getpWorkplace(): String? {
        return pWorkplace
    }

    fun setpWorkplace(pWorkplace: String?) {
        this.pWorkplace = pWorkplace
    }

    fun getpEducation(): String? {
        return pEducation
    }

    fun setpEducation(pEducation: String?) {
        this.pEducation = pEducation
    }

    fun getpProfilePicture(): String? {
        return pProfilePicture
    }

    fun setpProfilePicture(pProfilePicture: String?) {
        this.pProfilePicture = pProfilePicture
    }
}