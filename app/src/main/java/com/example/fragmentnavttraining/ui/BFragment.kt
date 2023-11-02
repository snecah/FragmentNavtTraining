package com.example.fragmentnavttraining.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentnavttraining.R
import com.example.fragmentnavttraining.contract.HasTitle
import com.example.fragmentnavttraining.contract.router
import com.example.fragmentnavttraining.databinding.FragmentBBinding

class BFragment : Fragment(R.layout.fragment_b), HasTitle {

    private val binding by viewBinding(FragmentBBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle()

        binding.buttonGoToC.setOnClickListener {
            router().passMessageToFragment(CFragment(), getString(R.string.hello_fragment_c))
        }

        binding.buttonBackToA.setOnClickListener {
            router().launchFragment(AFragment())
        }
    }

    override fun setTitle() {
        requireActivity().title = "Fragment B"
    }

}