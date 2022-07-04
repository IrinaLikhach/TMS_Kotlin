package com.example.tms_kotlin.hw24

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms_kotlin.databinding.FragmentHw24Binding
import com.example.tms_kotlin.hw24.adapter.PeopleAdapter

class hw24_Fragment : Fragment() {

    private var userlist: MutableList<UserWithImage> = mutableListOf()
    private var _binding: FragmentHw24Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw24Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvList.adapter = PeopleAdapter(getUsers())
    }

    fun getUsers() = mutableListOf<UserWithImage>(
        UserWithImage("Olga", "Petrova", 24, ""),
        UserWithImage("Sergey", "Ivanov", 28, ""),
        UserWithImage("Ivan", "Smirnov", 22, ""),
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
