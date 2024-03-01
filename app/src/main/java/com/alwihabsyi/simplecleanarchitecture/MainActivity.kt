package com.alwihabsyi.simplecleanarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.alwihabsyi.simplecleanarchitecture.databinding.ActivityMainBinding
import com.alwihabsyi.simplecleanarchitecture.presentation.MainViewModel
import com.alwihabsyi.simplecleanarchitecture.presentation.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<MainViewModel> { MainViewModelFactory.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.setName("Clean ash")
        viewModel.message.observe(this) {
            binding.tvWelcome.text = it.welcomeMessage
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}