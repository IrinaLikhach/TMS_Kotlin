package com.example.tms_kotlin.hw23.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tms_kotlin.R
import com.example.tms_kotlin.databinding.ItemUserBinding
import com.example.tms_kotlin.hw23.UserWithImage

class PeopleViewHolder(private val itemBinding : ItemUserBinding): RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(user : UserWithImage){
        with(itemBinding){
            tvName.text = user.name
            tvSecondName.text = user.secondName
            tvAge.text = user.age.toString()
            Glide.with(itemView.context)
                .load(user.photo)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(ivPhoto)

        }
    }
}
