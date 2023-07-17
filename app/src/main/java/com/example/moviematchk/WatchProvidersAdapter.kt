package com.example.moviematchk

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moviematchk.model.WatchProvider

class WatchProvidersAdapter(providers : Array<WatchProvider>): RecyclerView.Adapter<WatchProvidersAdapter.ViewHolder>(){

    class ViewHolder (view: View) : RecyclerView.ViewHolder (view){
        val wp_img : ImageView
        val wp_name : TextView

        init {
            wp_img = view.findViewById(R.id.wp_img)
            wp_name = view.findViewById(R.id.wp_name)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WatchProvidersAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.watch_providers_item, parent, false )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: WatchProvidersAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}