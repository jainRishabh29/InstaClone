package com.example.insta_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class DmRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<DirectMessage> = ArrayList()

    override fun getItemViewType(position: Int): Int {
        return if (position==0) 0
        else 1

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater :LayoutInflater = LayoutInflater.from(parent.context)
        val view:View
        if (viewType==1){
            view = layoutInflater.inflate(R.layout.message_list_item,parent,false)
            return DmViewHolder(view)
        }
        else{
            view = layoutInflater.inflate(R.layout.search_bar_item,parent,false)
            return SearchViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {

            is DmViewHolder -> {
                holder.bind(items.get(position))
            }
            is SearchViewHolder ->{
                holder.bindS()
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
            user_name.text = directMessage.name
            eText.text = directMessage.eText
            Glide.with(itemView.context).load(directMessage.profileImage).into(profileImage)

        }
    }

    class SearchViewHolder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
        val search_bar : EditText = itemView.findViewById(R.id.searchBar)

        fun bindS(){
            search_bar.hint = "Search"
        }
    }


}