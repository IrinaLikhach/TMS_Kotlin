package com.example.tms_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms_kotlin.databinding.FragmentButtonMainBinding
import com.example.tms_kotlin.hw14.hw14_Fragment
import com.example.tms_kotlin.hw15.hw15_Fragment
import com.example.tms_kotlin.hw16.hw16_Fragment
import com.example.tms_kotlin.hw17.hw17_Fragment
import com.example.tms_kotlin.hw19.hw19_Fragment
import com.example.tms_kotlin.hw23.hw23_Fragment

class ButtonMainFragment : Fragment() {

    private var _binding: FragmentButtonMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentButtonMainBinding.inflate(inflater, container, false)

        binding.btnHw14.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, hw14_Fragment())
                ?.addToBackStack("Main Menu")
                ?.commit()
        }

        binding.btnHw15.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, hw15_Fragment())
                ?.addToBackStack("Main Menu")
                ?.commit()
        }

        binding.btnHw16.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, hw16_Fragment())
                ?.addToBackStack("Main Menu")
                ?.commit()
        }

        binding.btnHw17.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, hw17_Fragment())
                ?.addToBackStack("Main Menu")
                ?.commit()
        }

        binding.btnHw19.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, hw19_Fragment())
                ?.addToBackStack("Main Menu")
                ?.commit()
        }

        binding.btnHw23.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, hw23_Fragment())
                ?.addToBackStack("Main Menu")
                ?.commit()
        }


        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

