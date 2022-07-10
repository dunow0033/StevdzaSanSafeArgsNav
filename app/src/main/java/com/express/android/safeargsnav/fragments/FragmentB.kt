package com.express.android.safeargsnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.express.android.safeargsnav.R
import com.express.android.safeargsnav.databinding.FragmentABinding
import com.express.android.safeargsnav.databinding.FragmentBBinding
import com.express.android.safeargsnav.model.User

class FragmentB : Fragment() {

    private lateinit var _binding: FragmentBBinding
    private val binding: FragmentBBinding get() = _binding

    val args: FragmentBArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = "FirstName: ${args.currentUser.firstName} \n LastName: ${args.currentUser.lastName}"

    }
}