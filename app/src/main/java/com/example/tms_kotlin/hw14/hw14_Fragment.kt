package com.example.tms_kotlin.hw14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tms_kotlin.R
import com.example.tms_kotlin.databinding.FragmentHw14Binding
import com.example.tms_kotlin.databinding.FragmentHw16Binding

class hw14_Fragment : Fragment() {

    var userlist: MutableList<User> = mutableListOf()

    private var _binding: FragmentHw14Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw14Binding.inflate(inflater, container, false)
        return binding.root
    }

//    //Task1
//    addUser("Anna", "Petrovna", 18)
//    addUser("Ivan", "Nikolaevich", 32)
//    addUser("Svetlana", "Valentinovna", 27)
//    addUser("Irina", "Nikolaevna", 34)
//
//    outUser()
//    sortUser()
//    deleteUser()

//    // HW #2
//    val button: Button = findViewById(R.id.button)
//    val textView5: TextView = findViewById(R.id.textView5)
//    button.setOnClickListener {
//        textView5.text = when ((1..7).random()) {
//            1 -> "Да"
//            2 -> "Нет"
//            3 -> "Скорее всего да"
//            4 -> "Скорее всего нет"
//            5 -> "Возможно"
//            6 -> "Имеются перспективы"
//            else -> "Вопрос задан неверно"
//        }
//    }
}
