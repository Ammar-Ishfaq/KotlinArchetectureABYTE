package com.example.app_name.view.fragments.notifications

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.example.app_name.R
import com.example.app_name.util.MaterialDialogHelper
import com.example.app_name.view.fragments.base.MainMVVMNavigationFragment
import com.example.app_name.extensions.setupProgressDialog
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class NotificationsFragment :
    MainMVVMNavigationFragment<NotificationsViewModel>(NotificationsViewModel::class) {
    private val navArgs by navArgs<NotificationsFragmentArgs>()

    override fun getLayoutResId(): Int {
        return R.layout.fragment_notifications
    }

    override fun inOnCreateView(mRootView: ViewGroup, savedInstanceState: Bundle?) {
        val dialogHelper by inject<MaterialDialogHelper>()
        setupProgressDialog(viewModel.showHideProgressDialog, dialogHelper)
        val strArgumentGetting = navArgs.nameStr
        
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