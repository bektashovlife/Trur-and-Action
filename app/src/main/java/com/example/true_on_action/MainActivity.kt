package com.example.true_on_action

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.true_on_action.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tV.setOnClickListener{
            binding.tV.text = getApp()
        }
    }
    private fun getApp(): String{
        return resources.getStringArray(R.array.true_or_action)[getNumber()]
    }

    private fun getNumber(): Int{
        val size = resources.getStringArray(R.array.true_or_action).size -1
        return (0..size).random()
    }

}