package com.example.tms_kotlin.hw23

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms_kotlin.databinding.FragmentHw23Binding
import com.example.tms_kotlin.hw23.adapter.PeopleAdapter

class hw23_Fragment : Fragment() {

    private var userlist: MutableList<UserWithImage> = mutableListOf()
    private var _binding: FragmentHw23Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw23Binding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvList.adapter = PeopleAdapter (getUsers())
    }

    fun getUsers() = mutableListOf<UserWithImage>(
        UserWithImage("Olga", "Petrova", 24, "https://static8.tgstat.ru/channels/_0/26/2647150c2f9771a41145032b86b6c8a4.jpg"),
        UserWithImage("Sergey", "Ivanov", 28, "https://klike.net/uploads/posts/2019-06/1560664251_3.jpg"),
        UserWithImage("Ivan", "Smirnov", 22, "https://i.pinimg.com/originals/67/6a/57/676a57623559bcc564c19e64747cdcc0.jpg"),
    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}