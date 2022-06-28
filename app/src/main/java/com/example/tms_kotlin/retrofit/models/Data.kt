package com.example.tms_kotlin.retrofit.models

data class Data(
    val count: Int,
    val next: Any,
    val previous: Any,
    val results: List<Film>
)