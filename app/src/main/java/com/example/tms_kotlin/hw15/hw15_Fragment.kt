package com.example.tms_kotlin.hw15

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.tms_kotlin.databinding.FragmentHw15Binding

class hw15_Fragment : Fragment() {

    //var userlist: MutableList<User> = mutableListOf()
    private val listUsers = ListUsers()
    private var _binding: FragmentHw15Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw15Binding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Task1
        listUsers.addUser("Anna", "Petrovna", 18)
        listUsers.addUser("Ivan", "Nikolaevich", 32)
        listUsers.addUser("Svetlana", "Valentinovna", 27)
        listUsers.addUser("Irina", "Nikolaevna", 34)
        outList()

        binding.btnHw15t1Sort.setOnClickListener { sortUsers() }
        binding.btnHw15t1SortByAge.setOnClickListener { deleteUsers() }
        binding.btnHw15t2Generate.setOnClickListener { generateInt() }
        binding.btnHw15t3Calculate.setOnClickListener { summaAllNumbers() }
        binding.tvHw15t4.text = "Cумма чисел от 1 до 100 равна ${(1..100).sum()}"
    }

    private fun outList () {
        binding.tvHw15t1.text = listUsers.outUsers()
    }

    fun sortUsers() {
        listUsers.sortUsers()
        outList()
    }

    fun deleteUsers () {
        listUsers.deleteUsers()
        outList()
    }

    fun generateInt () {
        val i = (5..155).random()
        binding.tvHw15t2.text = if (i in 25..100 ) "число $i входит в диапазон (25;100)"
        else "число $i не входит в диапазон (25;100)"
    }

    fun summaAllNumbers () {
        val str = binding.etHw15t3Number.text.toString()
        var sum = 0
        str.forEach { c: Char -> sum+=c.digitToInt() }
        binding.tvHw15t3.text = "Сумма цифр в числе равна $sum"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}