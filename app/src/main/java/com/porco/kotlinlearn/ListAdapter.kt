package com.porco.kotlinlearn

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by porco on 2017/7/10.
 */
class ListAdapter (val items: List<String>) : RecyclerView.Adapter<ListAdapter.ViewHolder>(){

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int = items.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(TextView(parent.context))


    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView){

    }
}