package com.example.app_name.koinDI

import com.example.app_name.view.fragments.dashboard.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dashboardModule = module {
    viewModel {
        DashboardViewModel(
            get()
        )
    }
}