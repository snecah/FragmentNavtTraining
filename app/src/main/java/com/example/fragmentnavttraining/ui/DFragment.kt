package com.example.fragmentnavttraining.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentnavttraining.R
import com.example.fragmentnavttraining.contract.HasTitle
import com.example.fragmentnavttraining.databinding.FragmentDBinding

class DFragment : Fragment(R.layout.fragment_d), HasTitle {
    private val binding by viewBinding(FragmentDBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle()

        binding.buttonGoToB.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack(
                requireActivity().supportFragmentManager.getBackStackEntryAt(1).id,
                FragmentManager.POP_BACK_STACK_INCLUSIVE
            )
        }
    }

    override fun setTitle() {
        requireActivity().title = "Fragment D"
    }

}