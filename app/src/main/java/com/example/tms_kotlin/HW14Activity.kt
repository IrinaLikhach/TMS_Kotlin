package com.example.tms_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class HW14Activity : AppCompatActivity() {

    var userlist: MutableList<User> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw14)

    //Task1
        addUser("Anna", "Petrovna", 18)
        addUser("Ivan", "Nikolaevich", 32)
        addUser("Svetlana", "Valentinovna", 27)
        addUser("Irina", "Nikolaevna", 34)

        outUser()
    }

    private fun addUser(name: String, secondName: String, age: Int) {
        val user = User(name, secondName, age)
        userlist.add(user)
    }

    private fun outUser() {
        for (user in userlist) {
            println(user)
        }
    }

    //Task2
    val answers = listOf(
        "Да",
        "Нет",
        "Скорее всего да",
        "Скорее всего нет",
        "Возможно",
        "Имеются перспективы",
        "Вопрос задан неверно"
    )

    fun main() {
        val scanner = Scanner(System.`in`)
        val question = scanner.nextLine()
        if (question == " ") {
            println("Ask your question")
        }
        println(answers.random())
    }
}