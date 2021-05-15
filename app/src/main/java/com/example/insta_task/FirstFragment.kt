package com.example.insta_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstFragment : Fragment() {
 private lateinit var postAdapter:PostRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_first, container, false)
        val recyclerV : RecyclerView = view.findViewById(R.id.recyclerV)
        recyclerV.apply {
            layoutManager = LinearLayoutManager(context)
            postAdapter = PostRecyclerAdapter()
            adapter = postAdapter
        }
        val data = DataSource.createDataSet()
        postAdapter.submitList(data)
        view.findViewById<ImageView>(R.id.messenger).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment) }

        return view
    }

}