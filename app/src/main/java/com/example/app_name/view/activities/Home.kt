package com.example.app_name.view.activities

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.app_name.view.activities.base.MainMVVMBaseActivity

class Home : MainMVVMBaseActivity<HomeActivityViewModel>(HomeActivityViewModel::class) {
    lateinit var navController: NavController
    private var navHostFragment: NavHostFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//        navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.login_nav_host_fragment) as NavHostFragment?
//        val inflater = navHostFragment?.navController?.navInflater
//        val graph = inflater?.inflate(R.navigation.nav_main)
//
//        graph?.startDestination = R.id.allUser
//
//        if (graph != null) {
//            navHostFragment?.navController?.graph = graph
//        }
//
//        navController = findNavController(R.id.login_nav_host_fragment)

    }


}