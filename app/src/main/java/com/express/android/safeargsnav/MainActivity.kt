package com.express.android.safeargsnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.express.android.safeargsnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //val _binding: ActivityMainBinding get() = binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}