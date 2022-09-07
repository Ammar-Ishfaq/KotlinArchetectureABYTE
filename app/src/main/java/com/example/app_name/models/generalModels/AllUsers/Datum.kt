package com.example.app_name.models.generalModels.AllUsers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Datum(
    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("parent_id")
    @Expose
    var parentId: String? = null,

    @SerializedName("nodeID")
    @Expose
    var nodeID: String? = null,

    @SerializedName("gender")
    @Expose
    var gender: String? = null,

    @SerializedName("name")
    @Expose
    var name: String? = null,

    @SerializedName("credentials_issued")
    @Expose
    var credentialsIssued: String? = null,

    @SerializedName("credentials_revoked")
    @Expose
    var credentialsRevoked: String? = null,

    @SerializedName("country")
    @Expose
    var country: String? = null,

    @SerializedName("city")
    @Expose
    var city: String? = null,

    @SerializedName("dob")
    @Expose
    var dob: String? = null,

    @SerializedName("dob_calendar_type")
    @Expose
    var dobCalendarType: String? = null,

    @SerializedName("profile_picture_square")
    @Expose
    var profilePictureSquare: String? = null,

    @SerializedName("profile_picture_circle")
    @Expose
    var profilePictureCircle: String? = null,

    @SerializedName("p_profile_picture")
    @Expose
    private var pProfilePicture: String? = null,

    @SerializedName("p_dob")
    @Expose
    private var pDob: String? = null,

    @SerializedName("p_mother_info")
    @Expose
    private var pMotherInfo: String? = null,

    @SerializedName("contact")
    @Expose
    var contact: String? = null,

    @SerializedName("contact_extension")
    @Expose
    var contactExtension: String? = null,

    @SerializedName("mobile")
    @Expose
    var mobile: String? = null,

    @SerializedName("email")
    @Expose
    var email: String? = null,

    @SerializedName("p_email")
    @Expose
    private var pEmail: String? = null,

    @SerializedName("sequence")
    @Expose
    var sequence: String? = null,

    @SerializedName("branch")
    @Expose
    var branch: String? = null,

    @SerializedName("workplaces")
    @Expose
    var workplaces: List<Workplace>? = null,

    @SerializedName("education")
    @Expose
    var education: List<Education>? = null,

    @SerializedName("p_mobile")
    @Expose
    private var pMobile: String? = null,

    @SerializedName("p_socialnetworks")
    @Expose
    private var pSocialnetworks: String? = null,

    @SerializedName("twitter")
    @Expose
    var twitter: String? = null,

    @SerializedName("instagram")
    @Expose
    var instagram: String? = null,

    @SerializedName("snapchat")
    @Expose
    var snapchat: String? = null,

    @SerializedName("full_name")
    @Expose
    var fullName: String? = null,

    @SerializedName("father_name")
    @Expose
    var fatherName: String? = null,

    @SerializedName("grand_father_name")
    @Expose
    var grandFatherName: String? = null,

    @SerializedName("g_grand_father_name")
    @Expose
    var gGrandFatherName: String? = null,

    @SerializedName("next_g_grand_father_one")
    @Expose
    var nextGGrandFatherOne: String? = null,

    @SerializedName("next_g_grand_father_two")
    @Expose
    var nextGGrandFatherTwo: String? = null,

    @SerializedName("mother_full_name")
    @Expose
    var motherFullName: String? = null,

    @SerializedName("scholar")
    @Expose
    var scholar: String? = null,

    @SerializedName("judge")
    @Expose
    var judge: String? = null,

    @SerializedName("poet")
    @Expose
    var poet: String? = null,

    @SerializedName("scientist")
    @Expose
    var scientist: String? = null,

    @SerializedName("governer")
    @Expose
    var governer: String? = null,

    @SerializedName("ref_id")
    @Expose
    var refId: String? = null,

    @SerializedName("status")
    @Expose
    var status: String? = null,

    @SerializedName("alive")
    @Expose
    var alive: String? = null,

    @SerializedName("generation")
    @Expose
    var generation: String? = null,

    @SerializedName("in_family_committee")
    @Expose
    var inFamilyCommittee: String? = null,

    @SerializedName("is_celebrity")
    @Expose
    var isCelebrity: String? = null,

    @SerializedName("is_locked")
    @Expose
    var isLocked: String? = null,

    @SerializedName("is_disabled")
    @Expose
    var isDisabled: String? = null,
    @SerializedName("is_worthy")
    @Expose
    var isWorthy: String? = null


)