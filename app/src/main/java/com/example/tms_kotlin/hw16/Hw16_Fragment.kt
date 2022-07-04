package com.example.tms_kotlin.hw16

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.tms_kotlin.databinding.FragmentHw16Binding

class hw16_Fragment : Fragment() {

    private var _binding: FragmentHw16Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHw16Binding.inflate(inflater, container, false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Task1
        binding.btnHw16t1.setOnClickListener {
            val a = (0..50).random()
            val b = (0..50).random()
            binding.tvFrHw16t1.text = when (a % 2) {
                0 -> {
                    "a = $a четное, b = $b, a*b = ${a * b}"
                }
                else -> {
                    "a = $a нечетное, b = $b, a+b = ${a + b}"
                }
            }
        }

        //Task2
        binding.btnHw16t2.setOnClickListener {
            val a = (0..20).random()
            val b = (0..20).random()
            val c = (0..20).random()
            val s: (Int, Int, Int) -> Int = { a, b, c ->
                Integer.max((a * b * c), (a + b + c))
            }
            binding.tvFrHw16t2.text = "a=$a, b=$b, c=$c, max=${s(a, b, c)}"
        }

        //Task3

        binding.btnHw16t3.setOnClickListener {
            val studentRating = ((0..100).random())
            val studentMark = when (studentRating) {
                in (0..19) -> 'F'
                in (20..39) -> 'E'
                in (40..59) -> 'D'
                in (60..74) -> 'C'
                in (75..89) -> 'B'
                in (90..100) -> 'A'
                else -> "Данная отметка не существует"
            }
            binding.tvFrHw16t3.text = "У студента рейтинг: $studentRating, отметка: $studentMark"
        }

        //Task4
        binding.btnHw16t4.setOnClickListener {
            val a1 = (1..20).random()
            val b1 = (1..20).random()
            val a2 = (1..20).random()
            val b2 = (1..20).random()
            val str = when {
                ((a1 > a2) and (b1 > b2)) or ((a1 > b2) and (b1 > a2)) -> "В 1-ый можно поместить 2-ой."
                ((a1 < a2) and (b1 < b2)) or ((a1 < b2) and (b1 < a2)) -> "Во 2-ой можно поместить 1-ый."
                else -> "Нельзя вместить конверты"
            }
            binding.tvFrHw16t4.text = "Стороны 1-ого конверта  ($a1;$b1). 2-ого ($a2;$b2). $str"
        }
    }
}
