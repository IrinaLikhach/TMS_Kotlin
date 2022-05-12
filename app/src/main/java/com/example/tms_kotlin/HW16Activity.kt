package com.example.tms_kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.max

class HW16Activity : AppCompatActivity() {

    lateinit var btnHw16t1: Button
    lateinit var task1hw16: TextView
    lateinit var btnHw16t2: Button
    lateinit var task2hw16: TextView
    lateinit var btnHw16t3: Button
    lateinit var task3hw16: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw16)
        initView()

        //Task1
        btnHw16t1.setOnClickListener {
            val a = (0..50).random()
            val b = (0..50).random()
            task1hw16.text = when (a % 2) {
                0 -> {
                    "a = $a четное, b = $b, a*b = ${a * b}"
                }
                else -> {
                    "a = $a нечетное, b = $b, a+b = ${a + b}"
                }
            }
        }

        //Task2
        btnHw16t2.setOnClickListener {
            val a = (0..20).random()
            val b = (0..20).random()
            val c = (0..20).random()
            val s: (Int, Int, Int) -> Int = { a, b, c ->
                max((a * b * c), (a + b + c))
            }
            task2hw16.text = "a=$a, b=$b, c=$c, max=${s(a, b, c)}"
        }

        //Task3
        btnHw16t3.setOnClickListener {
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
            task3hw16.text = "У студента рейтинг: $studentRating, отметка: $studentMark"
        }
    }

    private fun initView() {
        btnHw16t1 = findViewById(R.id.btnHw16t1)
        task1hw16 = findViewById(R.id.tvHw16t1)
        btnHw16t2 = findViewById(R.id.btnHw16t2)
        task2hw16 = findViewById(R.id.tvHw16t2)
        btnHw16t3 = findViewById(R.id.btnHw16t3)
        task3hw16 = findViewById(R.id.tvHw16t3)
    }
}
