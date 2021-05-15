package com.example.insta_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class PostRecyclerAdapter :RecyclerView.Adapter<PostRecyclerAdapter.PostViewHolder>(){

    private var items: List<Post> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.post_list_item,parent,false)
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        when(holder) {

            is PostViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(postList: List<Post>){
        items = postList
    }

    class PostViewHolder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
        val acc_logo : ImageView = itemView.findViewById(R.id.accImage)
        val acc_name : TextView = itemView.findViewById(R.id.acc_name)
        val image : ImageView = itemView.findViewById(R.id.postImage)
        val liked_by : TextView = itemView.findViewById(R.id.likeText)
        val acc_name_bottom : TextView = itemView.findViewById(R.id.acc_name_bottom)
        val view_comment : TextView = itemView.findViewById(R.id.view_comment)

        fun bind(post:Post){
            acc_name.setText(post.acc_name)
            liked_by.setText(post.liked_by)
            acc_name_bottom.setText(post.acc_name_bottom)
            view_comment.setText(post.view_comment)

            Glide.with(itemView.context).load(post.acc_logo).into(acc_logo)
            Glide.with(itemView.context).load(post.image).into(image)
        }
    }
}