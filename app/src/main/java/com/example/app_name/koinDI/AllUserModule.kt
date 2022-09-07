package com.example.app_name.koinDI

import com.example.app_name.viewmodel.AllUserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val alluserModule = module {
    viewModel {
        AllUserViewModel(
            get()
        )
    }
}