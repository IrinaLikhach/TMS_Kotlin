package com.example.tms_kotlin.hw24.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.tms_kotlin.databinding.ItemUserBinding
import com.example.tms_kotlin.hw24.UserWithImage

class PeopleViewHolder(private val itemBinding : ItemUserBinding): RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(user : UserWithImage){
        with(itemBinding){
            tvName.text = user.name
            tvSecondName.text = user.secondName
            tvAge.text = user.age.toString()

        }

    }

}
