package com.example.app_name.view.fragments.userDetail

import android.os.Bundle
import android.view.ViewGroup
import com.example.app_name.R
import com.example.app_name.extensions.setupProgressDialog
import com.example.app_name.koinDI.userDetailModule
import com.example.app_name.util.MaterialDialogHelper
import com.example.app_name.view.fragments.base.MainMVVMNavigationFragment
import org.koin.android.ext.android.inject
import org.koin.core.module.Module
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_user_detail.view.*


class UserDetailFragment :
    MainMVVMNavigationFragment<UserDetailViewModel>(UserDetailViewModel::class) {

    private val navArgs: UserDetailFragmentArgs by navArgs()

    override fun getLayoutResId(): Int = R.layout.fragment_user_detail

    override fun registerModule(): Module {
        return userDetailModule
    }

    override fun inOnCreateView(mRootView: ViewGroup, savedInstanceState: Bundle?) {
        val dialogHelper by inject<MaterialDialogHelper>()
        setupProgressDialog(viewModel.showHideProgressDialog, dialogHelper)

        navArgs.userDetail?.let {
            Glide.with(mRootView.fragment_user_detial_image_view).load(it.avatarUrl)
                .into(mRootView.fragment_user_detial_image_view)

            mRootView.fragment_user_detail_name.text = it.name
        }


    }


}