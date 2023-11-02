package com.example.fragmentnavttraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragmentnavttraining.contract.Router
import com.example.fragmentnavttraining.ui.AFragment
private const val MSG_KEY = "key"

class MainActivity : AppCompatActivity(), Router {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, AFragment()).commit()
    }


    override fun launchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().addToBackStack(null)
            .replace(R.id.fragment_container, fragment).commit()
    }

    override fun passMessageToFragment(fragment: Fragment, message: String) {
        fragment.arguments = bundleOf(MSG_KEY to message)
        launchFragment(fragment)
    }

    override fun goBack() {
        supportFragmentManager.popBackStack()
    }

    override fun goToFirst() {
        supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
    }
}