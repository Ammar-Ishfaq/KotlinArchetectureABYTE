package com.example.app_name.view.fragments.dashboard

import android.os.Bundle
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.app_name.R
import com.example.app_name.koinDI.dashboardModule
import com.example.app_name.util.MaterialDialogHelper
import com.example.app_name.view.fragments.base.MainMVVMNavigationFragment
import com.example.app_name.extensions.setupProgressDialog
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.core.module.Module


class DashboardFragment :
    MainMVVMNavigationFragment<DashboardViewModel>(DashboardViewModel::class) {


    override fun getLayoutResId(): Int = R.layout.fragment_dashboard

    override fun registerModule(): Module {
        return dashboardModule
    }

    override fun inOnCreateView(mRootView: ViewGroup, savedInstanceState: Bundle?) {
        val dialogHelper by inject<MaterialDialogHelper>()
        setupProgressDialog(viewModel.showHideProgressDialog, dialogHelper)

        lifecycleScope.launch {
            viewModel.getAllUserList();
            attachViewModel()
        }
    }

    private fun attachViewModel() {

        observe(viewModel.snackbarMessage) {
            val msg = it?.consume()
            if (!msg.isNullOrEmpty()) {
                showAlertDialog(msg)

            }
        }
        observe(viewModel.text) {
            val msg = it.consume()
            if (!msg.isNullOrEmpty()) {
                text_dashboard.text = msg
            }
        }

    }

}