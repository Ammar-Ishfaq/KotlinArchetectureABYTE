package com.example.app_name.koinDI

import com.example.app_name.view.fragments.home.HomeFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    viewModel {
        HomeFragmentViewModel(
            get()
        )
    }
}