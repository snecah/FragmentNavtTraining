package com.example.fragmentnavttraining.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentnavttraining.R
import com.example.fragmentnavttraining.contract.HasTitle
import com.example.fragmentnavttraining.contract.router
import com.example.fragmentnavttraining.databinding.FragmentCBinding

private const val MSG_KEY = "key"

class CFragment : Fragment(R.layout.fragment_c), HasTitle {
    private val binding by viewBinding(FragmentCBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle()
        binding.helloTextView.text = arguments?.getString(MSG_KEY)

        binding.buttonBackToA.setOnClickListener {
            router().goToFirst()
        }

        binding.buttonGoToD.setOnClickListener {
            router().launchFragment(DFragment())
        }

    }

    override fun setTitle() {
        requireActivity().title = "Fragment C"
    }

}