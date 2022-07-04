package com.example.tms_kotlin.hw18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms_kotlin.R
import com.example.tms_kotlin.databinding.FragmentHw17Binding

class hw18_Fragment : Fragment() {

    private var _binding: FragmentHw17Binding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_hw18_, container, false)
    }
}