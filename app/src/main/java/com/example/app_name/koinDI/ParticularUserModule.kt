package com.example.app_name.koinDI

import com.example.app_name.viewmodel.ParticularUserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val particularUserModule = module {
    viewModel {
        ParticularUserViewModel(
            get()
        )
    }
}