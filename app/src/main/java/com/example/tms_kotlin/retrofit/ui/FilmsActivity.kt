package com.example.tms_kotlin.retrofit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.tms_kotlin.R

class FilmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_films2)
        val viewModel = ViewModelProvider(this).get(FilmsViewModel::class.java)
        viewModel.getFilms()
        viewModel.filmsLiveData.observe(this){
            Log.e("Film", it.results.joinToString())

        }
    }
}