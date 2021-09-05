package com.hotakus.androidleaning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hotakus.androidleaning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private fun bindingInit() {
        binding = ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingInit()
        setContentView(binding.root)

        binding.t.text = "test"

    }
}