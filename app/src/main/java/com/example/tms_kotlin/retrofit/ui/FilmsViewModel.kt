package com.example.tms_kotlin.retrofit.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tms_kotlin.retrofit.APIService
import com.example.tms_kotlin.retrofit.models.Data
import kotlinx.coroutines.launch

class FilmsViewModel : ViewModel() {
    val filmsLiveData = MutableLiveData <Data>()
    fun getFilms() {
        viewModelScope.launch {
            val resp = APIService.getInstance().getFilms()
            filmsLiveData.postValue(resp.body())
        }
    }
}