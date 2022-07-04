package com.example.tms_kotlin.hw15

import com.example.tms_kotlin.hw14.User

class ListUsers {
    private var usersList: MutableList<User> = mutableListOf()

    fun addUser (Name: String, secondName: String, age:Int) =
        usersList.add(User(Name,secondName,age))

    fun outUsers(): String =
        usersList.toString()

    fun deleteUsers (){
        usersList.minusAssign(usersList.filter { it.age <25 })
    }

    fun sortUsers(){
        usersList.sortBy {it.name}
    }
}