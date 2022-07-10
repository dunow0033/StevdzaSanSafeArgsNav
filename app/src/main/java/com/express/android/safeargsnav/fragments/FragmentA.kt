package com.express.android.safeargsnav.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.express.android.safeargsnav.databinding.FragmentABinding
import com.express.android.safeargsnav.model.User

class FragmentA : Fragment() {

    private lateinit var _binding: FragmentABinding
    private val binding: FragmentABinding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentABinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.sendBtn.setOnClickListener {
            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()
            val user = User(firstName, lastName)

            val action = FragmentADirections.actionFragmentAToFragmentB(user)
            findNavController().navigate(action)
        }
    }
}