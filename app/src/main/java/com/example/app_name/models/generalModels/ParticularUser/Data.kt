package com.example.app_name.models.generalModels.ParticularUser

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class Data {
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

    @SerializedName("full_name")
    @Expose
    var fullName: String? = null

    @SerializedName("father_name")
    @Expose
    var fatherName: String? = null

    @SerializedName("grand_father_name")
    @Expose
    var grandFatherName: String? = null

    @SerializedName("g_grand_father_name")
    @Expose
    private var gGrandFatherName: String? = null

    @SerializedName("next_g_grand_father_one")
    @Expose
    var nextGGrandFatherOne: String? = null

    @SerializedName("next_g_grand_father_two")
    @Expose
    var nextGGrandFatherTwo: String? = null

    @SerializedName("mother_full_name")
    @Expose
    var motherFullName: String? = null

    @SerializedName("scholar")
    @Expose
    var scholar: String? = null

    @SerializedName("judge")
    @Expose
    var judge: String? = null

    @SerializedName("poet")
    @Expose
    var poet: String? = null

    @SerializedName("scientist")
    @Expose
    var scientist: String? = null

    @SerializedName("governer")
    @Expose
    var governer: String? = null

    @SerializedName("ref_id")
    @Expose
    var refId: String? = null

    @SerializedName("status")
    @Expose
    var status: String? = null

    @SerializedName("alive")
    @Expose
    var alive: String? = null

    @SerializedName("generation")
    @Expose
    var generation: String? = null

    @SerializedName("in_family_committee")
    @Expose
    var inFamilyCommittee: String? = null

    @SerializedName("is_celebrity")
    @Expose
    var isCelebrity: String? = null

    @SerializedName("is_locked")
    @Expose
    var isLocked: String? = null

    @SerializedName("is_disabled")
    @Expose
    var isDisabled: String? = null

    @SerializedName("is_worthy")
    @Expose
    var isWorthy: String? = null

    @SerializedName("brief_description")
    @Expose
    var briefDescription: String? = null

    @SerializedName("wife_name")
    @Expose
    var wifeName: String? = null

    @SerializedName("w_father_name")
    @Expose
    private var wFatherName: String? = null

    @SerializedName("w_grand_father_name")
    @Expose
    private var wGrandFatherName: String? = null

    @SerializedName("username")
    @Expose
    var username: String? = null

    @SerializedName("twitter")
    @Expose
    var twitter: String? = null

    @SerializedName("instagram")
    @Expose
    var instagram: String? = null

    @SerializedName("snapchat")
    @Expose
    var snapchat: String? = null

    @SerializedName("commitee_designation")
    @Expose
    var commiteeDesignation: String? = null

    @SerializedName("commitee_name")
    @Expose
    var commiteeName: String? = null

    @SerializedName("children")
    @Expose
    var children: List<Child>? = null

    @SerializedName("siblings")
    @Expose
    var siblings: List<Sibling>? = null

    @SerializedName("workplaces")
    @Expose
    var workplaces: List<Workplace>? = null

    @SerializedName("p_wife_info")
    @Expose
    private var pWifeInfo: String? = null

    @SerializedName("p_location")
    @Expose
    private var pLocation: String? = null

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

    @SerializedName("education")
    @Expose
    var education: List<Education__1>? = null
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

    fun getgGrandFatherName(): String? {
        return gGrandFatherName
    }

    fun setgGrandFatherName(gGrandFatherName: String?) {
        this.gGrandFatherName = gGrandFatherName
    }

    fun getwFatherName(): String? {
        return wFatherName
    }

    fun setwFatherName(wFatherName: String?) {
        this.wFatherName = wFatherName
    }

    fun getwGrandFatherName(): String? {
        return wGrandFatherName
    }

    fun setwGrandFatherName(wGrandFatherName: String?) {
        this.wGrandFatherName = wGrandFatherName
    }

    fun getpWifeInfo(): String? {
        return pWifeInfo
    }

    fun setpWifeInfo(pWifeInfo: String?) {
        this.pWifeInfo = pWifeInfo
    }

    fun getpLocation(): String? {
        return pLocation
    }

    fun setpLocation(pLocation: String?) {
        this.pLocation = pLocation
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
}