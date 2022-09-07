package com.example.app_name.view.fragments.home

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.app_name.R
import com.example.app_name.koinDI.homeModule
import com.example.app_name.util.MaterialDialogHelper
import com.example.app_name.view.fragments.base.MainMVVMNavigationFragment
import com.example.app_name.extensions.setupProgressDialog
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.core.module.Module

class HomeFragment :
    MainMVVMNavigationFragment<HomeFragmentViewModel>(HomeFragmentViewModel::class) {


    override fun getLayoutResId() = R.layout.fragment_home
    override fun registerModule(): Module {
        return homeModule
    }

    override fun inOnCreateView(mRootView: ViewGroup, savedInstanceState: Bundle?) {
        val dialogHelper by inject<MaterialDialogHelper>()
        setupProgressDialog(viewModel.showHideProgressDialog, dialogHelper)

        lifecycleScope.launch {
            viewModel.getAllUserList();
        }


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment_home_dashboard.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionNavigationHomeToNavigationDashboard()
            )
        }
        fragment_home_notification.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.actionNavigationHomeToNavigationNotifications(
                    "A testing Passing Arguments to the Controller"
                )
            )
        }


    }
}