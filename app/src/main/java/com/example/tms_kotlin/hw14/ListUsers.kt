package com.example.tms_kotlin.hw14

class ListUsers {
    private var usersList: MutableList<User> = mutableListOf()

    fun addUser (Name: String, secondName: String, age:Int) =
        usersList.add(User(Name,secondName,age))

    fun outUsers(): String =
        usersList.toString()
}