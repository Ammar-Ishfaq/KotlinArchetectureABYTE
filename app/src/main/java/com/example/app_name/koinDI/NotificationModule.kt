package com.example.app_name.koinDI

import com.example.app_name.view.fragments.dashboard.DashboardViewModel
import com.example.app_name.view.fragments.notifications.NotificationsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val notificationModule = module {
    viewModel {
        NotificationsViewModel(
            get()
        )
    }
}