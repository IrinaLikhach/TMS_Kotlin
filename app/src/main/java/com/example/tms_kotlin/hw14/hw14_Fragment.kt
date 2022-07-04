package com.example.tms_kotlin.hw14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms_kotlin.databinding.FragmentHw14Binding

class hw14_Fragment : Fragment() {

    private val listUsers = ListUsers()
    private var _binding: FragmentHw14Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw14Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Task1
        listUsers.addUser("Anna", "Petrovna", 18)
        listUsers.addUser("Ivan", "Nikolaevich", 32)
        listUsers.addUser("Svetlana", "Valentinovna", 27)
        listUsers.addUser("Irina", "Nikolaevna", 34)
        binding.tvHw14t1.text = listUsers.outUsers()

        //Task2
        binding.button.setOnClickListener {
            binding.tvHw14t2.text = when ((1..7).random()) {
                1 -> "Да"
                2 -> "Нет"
                3 -> "Скорее всего да"
                4 -> "Скорее всего нет"
                5 -> "Возможно"
                6 -> "Имеются перспективы"
                else -> "Вопрос задан неверно"
            }
        }
    }
}
