package com.example.fragmentnavttraining.contract

import androidx.fragment.app.Fragment

fun Fragment.router() : Router = requireActivity() as Router

interface Router {
    fun launchFragment(fragment: Fragment)
    fun passMessageToFragment(fragment: Fragment, message: String)
    fun goBack()
    fun goToFirst()
}
