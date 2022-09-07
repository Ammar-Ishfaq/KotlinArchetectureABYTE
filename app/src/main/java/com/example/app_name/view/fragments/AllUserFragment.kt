//package com.example.app_name.view.fragments
//
//import android.content.Context
//import android.os.Build
//import android.os.Bundle
//import android.text.TextUtils
//import android.view.View
//import android.view.ViewGroup
//import androidx.core.content.ContextCompat
//import androidx.lifecycle.lifecycleScope
//import androidx.navigation.fragment.findNavController
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.app_name.R
//import com.example.app_name.adapters.AllUserAdapter
//import com.example.app_name.extensions.afterTextChanged
//import com.example.app_name.koinDI.alluserModule
//import com.example.app_name.models.generalModels.AllUsers.Datum
//import com.example.app_name.util.MaterialDialogHelper
//import com.example.app_name.util.StateViewUtils.Companion.INTERNET_CONNECTION_ERROR_MESSAGE
//import com.example.app_name.view.fragments.base.MainMVVMNavigationFragment
//import com.example.app_name.viewmodel.AllUserViewModel
//import com.example.app_name.extensions.setupProgressDialog
//import kotlinx.android.synthetic.main.fragment_all_user.*
//import kotlinx.coroutines.launch
//import org.koin.android.ext.android.inject
//import org.koin.core.module.Module
//
//class AllUserFragment : MainMVVMNavigationFragment<AllUserViewModel>(AllUserViewModel::class), {
//
//    private var homeList = mutableListOf<Datum>()
//    private var unFilterList = mutableListOf<Datum>()
//
//    companion object {
//        private const val VALID_STATUS_CODE = 200
//    }
//
//    private val allUserAdapter by lazy {
//        AllUserAdapter(requireContext(), this)
//    }
//
//    override fun getLayoutResId() = R.layout.fragment_all_user
//    override fun registerModule(): Module {
//        return alluserModule
//    }
//
//    override fun inOnCreateView(mRootView: ViewGroup, savedInstanceState: Bundle?) {
//        val dialogHelper by inject<MaterialDialogHelper>()
//        setupProgressDialog(viewModel.showHideProgressDialog, dialogHelper)
//
//        lifecycleScope.launch {
//            viewModel.getAllUserList();
//            attachViewModel()
//        }
//    }
//
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        worthyToogle.setOnClickListener { v: View? ->
//            allUserAdapter.Datum = unFilterList
//            val title = "Yes"
//            val filterList = allUserAdapter.Datum.filter {
//                it.isWorthy == title
//            }
//            allUserAdapter.Datum = filterList.toMutableList()
//            allUserAdapter.notifyDataSetChanged()
//            totalCounts.setText("" + allUserAdapter.Datum.size)
//        }
//        femaleToogle.setOnClickListener { v: View? ->
//            allUserAdapter.Datum = unFilterList
//            val wommen = "1"
//            val filterList = allUserAdapter.Datum.filter { it.gender == wommen }
//            allUserAdapter.Datum = filterList.toMutableList()
//            allUserAdapter.notifyDataSetChanged()
//            totalCounts.setText("" + allUserAdapter.Datum.size)
//        }
//        maleToogle.setOnClickListener { v: View? ->
//            allUserAdapter.Datum = unFilterList
//            val male = "0"
//            val filterList = allUserAdapter.Datum.filter { it.gender == male }
//            allUserAdapter.Datum = filterList.toMutableList()
//            allUserAdapter.notifyDataSetChanged()
//            totalCounts.setText("" + allUserAdapter.Datum.size)
//        }
//        search.afterTextChanged {
//            if (!TextUtils.isEmpty(it)) {
//                allUserAdapter.Datum = unFilterList
//                val mName = it//contains the text to be searched
//                allUserAdapter.filterSearch = mName
//                val filterList = allUserAdapter.Datum.filter { it.name == mName }
//                allUserAdapter.Datum = filterList.toMutableList()
//                allUserAdapter.notifyDataSetChanged()
//                totalCounts.setText("" + allUserAdapter.Datum.size)
//
//            }
//        }
///*
//else {
//if the search index is empty then follow this
//allUserAdapter.Datum = unFilterList
//allUserAdapter.notifyDataSetChanged()
//}
//*/
//        all_user_fragment_swipe_container.setOnRefreshListener {
//
//            all_user_fragment_swipe_container
//                .setProgressBackgroundColorSchemeColor(
//                    ContextCompat.getColor(
//                        requireContext(), R.color.appRed
//                    )
//                )
//            totalCounts.text = ""
//
//            allUserAdapter.Datum.clear()
//            allUserAdapter.notifyDataSetChanged()
//            if (
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    isNetworkAvailable(requireContext())
//                } else {
//                    true
//                }
//            ) {
//                viewModel.getAllUserList()
//            } else {
//                showAlertDialog(INTERNET_CONNECTION_ERROR_MESSAGE)
//            }
//            all_user_fragment_swipe_container.isRefreshing = false
//        }
//    }
//
//
//    private fun setAdapter() {
//
//        all_user_fragment_recycler_view.let {
//            it.layoutManager = LinearLayoutManager(requireContext())
//            it.adapter = allUserAdapter
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
//        observe(viewModel.mDatum) {
//            if (it.Status == VALID_STATUS_CODE) {
//
//                homeList = it.Data.toMutableList()
//                unFilterList = it.Data.toMutableList()
//
//                allUserAdapter.Datum = homeList
//
//                setAdapter()
//
//            } else if (it.Status == 422) {
//                if (it.Data.isEmpty()) {
//                    showAlertDialog("Nothing Found")
//                } else {
//                    showAlertDialog(it?.Message!!)
//                }
//            }
//        }
//    }
//
//
//    override fun onItemClick(context: Context, position: Int, data: Datum) {
//        //adapter click Listener
//        findNavController().navigate(
//            AllUserFragmentDirections.actionAllUserToNavParticularUser(
//                data.id!!,
//                data.profilePictureSquare
//            )
//        )
//    }
//}