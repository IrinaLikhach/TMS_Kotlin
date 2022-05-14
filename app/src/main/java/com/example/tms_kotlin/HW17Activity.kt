package com.example.tms_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.tms_kotlin.databinding.ActivityHw17Binding

class HW17Activity : AppCompatActivity() {
    private lateinit var binding: ActivityHw17Binding
    private var timer: CountDownTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHw17Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnStartHW17.setOnClickListener {
                startCountDownTimer(2000)
            }
        }
    }

    private fun startCountDownTimer(timeMillis: Long){
        timer?.cancel()
        timer = object : CountDownTimer (timeMillis, 1){
            override fun onTick(timeM: Long) {
                binding.tvTimer.text = timeM.toString()
            }

            override fun onFinish() {
                binding.tvTimer.text = "Finish"
            }
        }.start()
    }
}
