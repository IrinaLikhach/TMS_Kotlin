package com.example.tms_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tms_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, ButtonMainFragment())
            .addToBackStack("Main Button Menu")
            .commit()
    }
}