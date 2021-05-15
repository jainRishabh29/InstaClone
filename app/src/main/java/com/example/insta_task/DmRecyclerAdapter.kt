package com.example.insta_task

import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DmRecyclerAdapter :RecyclerView.Adapter<DmRecyclerAdapter.DmViewHolder>(){

    private var items: List<DirectMessage> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DmViewHolder {
        return DmViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.message_list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: DmViewHolder, position: Int) {
        when(holder) {

            is DmViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    fun submitList(DmList: List<DirectMessage>){
        items = DmList
    }

    class DmViewHolder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
        val user_name : TextView = itemView.findViewById(R.id.user_name)
        val profileImage : ImageView = itemView.findViewById(R.id.profileImg)
        val eText : TextView = itemView.findViewById(R.id.eText)

        fun bind(directMessage:DirectMessage){
            user_name.setText(directMessage.name)
            eText.setText(directMessage.eText)
            Glide.with(itemView.context).load(directMessage.profileImage).into(profileImage)

        }
    }
}