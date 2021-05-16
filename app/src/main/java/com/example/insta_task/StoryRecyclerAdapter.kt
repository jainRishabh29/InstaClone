package com.example.insta_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class StoryRecyclerAdapter : RecyclerView.Adapter<StoryRecyclerAdapter.StoryViewHolder>(){
    private var items: List<Story> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.story_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        when(holder) {

            is StoryViewHolder -> {
                holder.bind(items.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
      return  items.size
    }

    fun submitList(storyList: List<Story>){
        items = storyList
    }

    class StoryViewHolder constructor(itemView: View):RecyclerView.ViewHolder(itemView){
        val story_view : com.google.android.material.imageview.ShapeableImageView = itemView.findViewById(R.id.story_image)
        val story_name : TextView = itemView.findViewById(R.id.story_name)

        fun bind(story: Story){
            story_name.setText(story.story_name)
            Glide.with(itemView.context).load(story.story_image).into(story_view)
        }
    }

}