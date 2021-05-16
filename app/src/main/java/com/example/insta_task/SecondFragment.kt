package com.example.insta_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
    private lateinit var messageAdapter:DmRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_second, container, false)
        val recyclerVi : RecyclerView = view.findViewById(R.id.recyclerVi)
        recyclerVi.apply {
            layoutManager = LinearLayoutManager(context)
            messageAdapter = DmRecyclerAdapter()
            adapter = messageAdapter
        }
        val data = DmDataSource.createDataSet()
        messageAdapter.submitList(data)
     //    view.findViewById<ImageView>(R.id.backArrow).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment) }
        return view
    }

}