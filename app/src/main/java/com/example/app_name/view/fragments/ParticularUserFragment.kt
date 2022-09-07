//package com.example.app_name.view.fragments
//
//import android.app.AlertDialog
//import android.content.Context
//import android.content.Intent
//import android.graphics.Color
//import android.graphics.drawable.ColorDrawable
//import android.net.Uri
//import android.os.Bundle
//import android.text.TextUtils
//import android.view.*
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.lifecycleScope
//import androidx.navigation.fragment.findNavController
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.bumptech.glide.Glide
//import com.example.app_name.R
//import com.example.app_name.adapters.ChildAdapter
//import com.example.app_name.adapters.SiblingsAdapter
//import com.example.app_name.koinDI.particularUserModule
//import com.example.app_name.models.generalModels.ParticularUser.Data
//import com.example.app_name.util.MaterialDialogHelper
//import com.example.app_name.view.fragments.base.MainMVVMNavigationFragment
//import com.example.app_name.viewmodel.ParticularUserViewModel
//import com.example.app_name.extensions.setupProgressDialog
//import kotlinx.android.synthetic.main.dialog_social_layout.view.*
//import kotlinx.android.synthetic.main.fragment_particular_user.*
//import kotlinx.coroutines.launch
//import org.koin.android.ext.android.inject
//import org.koin.core.module.Module
//import androidx.navigation.fragment.navArgs
//
//class ParticularUserFragment :
//    MainMVVMNavigationFragment<ParticularUserViewModel>(ParticularUserViewModel::class) {
//
//    //    For accessing the arguments from the fragment ParticularUserFragmentArgs
//    private val navArgs: ParticularUserFragmentArgs by navArgs()
//    lateinit var mParticularUserData: Data
//
//    companion object {
//        private const val VALID_STATUS_CODE = 200
//    }
//
//    private val siblingsAdapter by lazy {
//        SiblingsAdapter(requireContext())
//    }
//    private val childrenAdapter by lazy {
//        ChildAdapter(requireContext())
//    }
//
//    private fun setSiblingAdapter() {
//        particular_user_siblings_recycler_view.let {
//            it.layoutManager = LinearLayoutManager(requireContext())
//            it.adapter = siblingsAdapter
//        }
//    }
//
//    private fun setChildrenAdapter() {
//        particular_user_child_recycler_view.let {
//            it.layoutManager = LinearLayoutManager(requireContext())
//            it.adapter = childrenAdapter
//        }
//    }
//
//    override fun getLayoutResId() = R.layout.fragment_particular_user
//    override fun registerModule(): Module {
//        return particularUserModule
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        particular_user_social.setOnClickListener { v: View? -> showSocialDetails(context) }
//        particular_user_phone.setOnClickListener { v: View? ->
//            val mobileNumber = mParticularUserData.mobile
//            if (!TextUtils.isEmpty(mobileNumber)) {
//                val intent = Intent()
//                intent.action = Intent.ACTION_DIAL // Action for what intent called for
//                intent.data =
//                    Uri.parse("tel: $mobileNumber") // Data with intent respective action on intent
//                startActivity(intent)
//            } else // Action for what intent called for
//            // Data with intent respective action on intent
//            {
//                Toast.makeText(context, "Number Not Found", Toast.LENGTH_SHORT).show()
//            }
//        }
//        email.setOnClickListener { v: View? ->
//            val str = mParticularUserData.email
//            if (!TextUtils.isEmpty(str)) {
//                val intent = Intent(Intent.ACTION_SEND)
//                intent.type = "*/*"
//                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(mParticularUserData.email))
//                startActivity(intent)
//            } else Toast.makeText(context, "Email Not Found", Toast.LENGTH_SHORT).show()
//        }
//        particular_user_back.setOnClickListener { v: View? ->
//            findNavController().popBackStack()
//        }
//
//        particular_user_child!!.setOnClickListener { v: View? ->
//            val img = mParticularUserData.profilePictureSquare
//            if (img!!.contains("http")) Glide.with(this).load(img)
//                .into(particular_user_child_top_node_img) else Glide.with(this)
//                .load(R.drawable.ic_empty_node).into(
//                    particular_user_child_top_node_img
//                )
//            particular_user_siblings_layout.visibility = View.GONE
//            particular_user_child_layout.visibility = View.VISIBLE
//            childrenAdapter.childrenList = mParticularUserData.children!!
//            setChildrenAdapter()
//
//        }
//        particular_user_sibling!!.setOnClickListener { v: View? ->
//            if (navArgs.userParentPicture!!.contains("http")) Glide.with(this)
//                .load(navArgs.userParentPicture).into(
//                    particular_user_siblings_top_node_img
//                ) else Glide.with(this).load(R.drawable.ic_empty_node)
//                .into(particular_user_siblings_top_node_img)
//
//            particular_user_child_layout.visibility = View.GONE
//            particular_user_siblings_layout.visibility = View.VISIBLE
//            siblingsAdapter.siblings = mParticularUserData.siblings!!
//            setSiblingAdapter()
//        }
//
//    }
//
//
//    override fun inOnCreateView(mRootView: ViewGroup, savedInstanceState: Bundle?) {
//        val dialogHelper by inject<MaterialDialogHelper>()
//        setupProgressDialog(viewModel.showHideProgressDialog, dialogHelper)
//
//        lifecycleScope.launch {
//            viewModel.getParticularUserById(navArgs.userId);
//            attachViewModel()
//        }
//    }
//
//    private fun attachViewModel() {
//
//        observe(viewModel.snackbarMessage) {
//            val msg = it?.consume()
//            if (!msg.isNullOrEmpty()) {
//                showAlertDialog(msg)
//
//            }
//        }
//
//        observe(viewModel.mParticularUser) {
//            if (it.Status == VALID_STATUS_CODE) {
//                mParticularUserData = it.Data
//                populateData();
//
//            } else if (it.Status == 422) {
//                showAlertDialog(it?.Message!!)
//            }
//        }
//    }
//
//    private fun populateData() {
//        try {
//            if (TextUtils.isEmpty(mParticularUserData.dob)) {
//                particular_user_dob_layout.visibility = View.GONE
//            } else {
//                particular_user_dob.text = mParticularUserData.dob
//            }
//            if (mParticularUserData.isWorthy.equals("yes", ignoreCase = true)) Glide.with(
//                this
//            ).load(R.drawable.ic_worthy_blue).into(
//                worthy!!
//            )
//
//            fName.text = mParticularUserData.name
//            //            name.setText(mParticularPerson.getChildData().getName() + " " + mParticularPerson.getChildData().getFatherName());
//            lName.text = mParticularUserData.fatherName
//
//
//            //if the location is empty then hide the icon of location
//            country!!.text = mParticularUserData.country
//            city!!.text = mParticularUserData.city
//            if (TextUtils.isEmpty(mParticularUserData.country) && TextUtils.isEmpty(
//                    mParticularUserData.city
//                )
//            ) {
//                locationIcon!!.visibility = View.GONE
//            }
//
//            //check that the breif particular_user_description exists or not
//            val breDec = mParticularUserData.briefDescription
//            if (TextUtils.isEmpty(breDec)) {
//                particular_user_description!!.visibility = View.GONE
//            }
//            breifDescription!!.text = breDec
//            val img = mParticularUserData.profilePictureSquare
//            if (img!!.contains("http")) Glide.with(this).load(img)
//                .into(particular_user_image!!) else Glide.with(
//                this
//            ).load(
//                if (mParticularUserData.gender == "0") R.drawable.ic_empty_node
//                else R.drawable.ic_female_toggle
//
//            ).fitCenter().into(
//                particular_user_image!!
//            )
//
//
//            //check that children exist
//            if (mParticularUserData.children!!.isEmpty()) {
//                particular_user_child!!.visibility = View.GONE
//            }
//            //check that siblings exist
//            if (mParticularUserData.siblings!!.isEmpty()) {
//                particular_user_sibling!!.visibility = View.GONE
//            }
//            //check the particular_user_phone exist or not
//            if (TextUtils.isEmpty(mParticularUserData.mobile)) Glide.with(this)
//                .load(R.drawable.ic_phone_disable).into(
//                    particular_user_phone!!
//                )
//            //check the particular_user_phone exist or not
//            if (TextUtils.isEmpty(mParticularUserData.email)) Glide.with(this)
//                .load(R.drawable.ic_email_disable).into(
//                    email!!
//                )
//            if (TextUtils.isEmpty(mParticularUserData.instagram)
//                && TextUtils.isEmpty(mParticularUserData.twitter)
//                && TextUtils.isEmpty(mParticularUserData.snapchat)
//            ) Glide.with(this).load(R.drawable.ic_social_disable).into(
//                particular_user_social!!
//            )
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//    }
//
//    private fun showSocialDetails(context: Context?) {
//        val dialog: AlertDialog
//        val builder = AlertDialog.Builder(context)
//        val inflater =
//            context?.getSystemService(AppCompatActivity.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        val v = inflater.inflate(R.layout.dialog_social_layout, null)
//        /*val twitter: TextView
//        val twitter1: TextView
//        val twitter2: TextView
//        val insta: TextView
//        val insta1: TextView
//        val insta2: TextView
//        val snap: TextView
//        val snap1: TextView
//        val snap2: TextView
//        twitter = v.findViewById(R.id.twitter)
//        twitter1 = v.findViewById(R.id.twitter1)
//        twitter2 = v.findViewById(R.id.twitter2)
//        insta = v.findViewById(R.id.insta)
//        insta1 = v.findViewById(R.id.insta1)
//        insta2 = v.findViewById(R.id.insta2)
//        snap = v.findViewById(R.id.snap)
//        snap1 = v.findViewById(R.id.snap1)
//        snap2 = v.findViewById(R.id.snap2)*/
//        builder.setView(v)
//        v.twitter.text = mParticularUserData.twitter
//        v.twitter1.text = mParticularUserData.name
//        v.twitter2.text = mParticularUserData.fatherName
//        v.snap.text = mParticularUserData.snapchat
//        v.snap1.text = mParticularUserData.name
//        v.snap2.text = mParticularUserData.fatherName
//        v.insta.text = mParticularUserData.instagram
//        v.insta1.text = mParticularUserData.name
//        v.insta2.text = mParticularUserData.fatherName
//        dialog = builder.create()
//        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        dialog.window!!.setDimAmount(0.2f)
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE) //as the keyboard Open move the dialog up to th ekeyboard
//        dialog.show()
//    }
//
//}