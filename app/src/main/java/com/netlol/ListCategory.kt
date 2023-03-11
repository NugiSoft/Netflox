package com.netlol

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ListCategory (val listData : List<String>): RecyclerView.Adapter<ListCategory.ListViewHolder>(){

    inner class ListViewHolder(listView: View):RecyclerView.ViewHolder(listView){
        val nameCategory : TextView=itemView.findViewById(R.id.tv_Category)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.catagori_film,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data =listData[position]
        holder.nameCategory.text = data

    }

    override fun getItemCount(): Int {
        return listData.size
    }

}