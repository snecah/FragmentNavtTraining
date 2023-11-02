package com.example.fragmentnavttraining.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fragmentnavttraining.R
import com.example.fragmentnavttraining.contract.HasTitle
import com.example.fragmentnavttraining.contract.router
import com.example.fragmentnavttraining.databinding.FragmentABinding

/**
 * A simple [Fragment] subclass.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AFragment : Fragment(R.layout.fragment_a), HasTitle{

    private val binding by viewBinding(FragmentABinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setTitle()

        binding.buttonGoToB.setOnClickListener {
            router().launchFragment(BFragment())
        }
    }
    override fun setTitle() {
        requireActivity().title = "Fragment A"
    }
}