package com.example.tms_kotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import java.util.*

class HW15Activity : AppCompatActivity() {
    var userlist: MutableList<User> = mutableListOf()

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Task1
        addUser("Anna", "Petrovna", 18)
        addUser("Ivan", "Nikolaevich", 32)
        addUser("Svetlana", "Valentinovna", 27)
        addUser("Irina", "Nikolaevna", 34)

        outUser()
        sortUser()
        deleteUser()

    }

    private fun addUser(name: String, secondName: String, age: Int) {
        val user = User(name, secondName, age)
        userlist.add(user)
    }

    fun toString(user: User): String {
        return "name: ${user.name}, secondName: ${user.secondName}, age: ${user.age}"
    }

    private fun outUser() {
        for (user in userlist) {
            println(user)
        }
    }

    fun sortUser() {
        userlist.sortBy { it.name }
        for (user in userlist) {
            println(toString(user))
        }

    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun deleteUser() {
        userlist.removeIf { it.age < 18 }
        for (user in userlist) {
            println(toString(user))
        }
    }


    //Task2
    fun generateNumber() {
        val randomNumber = (5..155).random()
        println(randomNumber)
        val interval = 25..100

        if (interval.contains(randomNumber)) {
            println("Contains")
        } else {
            println("Does not contains")
        }
    }


    //Task3
    fun sumOfAllNumbers() {
        var a: Int
        var Summ = 0
        val scanner = Scanner(System.`in`)
        a = scanner.nextInt()
        while (a != 0) {
            Summ += (a % 10);
            a /= 10;
        }
        System.out.println("Summ of numbers $Summ")
    }

    //Task4
    fun summOfNumbers() {
        val number = 100
        var summ = 0
        for (i in 1..number) {
            summ += i
        }
        println(summ)
    }
}