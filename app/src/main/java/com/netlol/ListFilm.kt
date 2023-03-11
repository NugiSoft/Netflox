package com.netlol

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ListFilm (val listData:List<Film>):RecyclerView.Adapter<ListFilm.ListViewHolder>(){
    inner class ListViewHolder(listView: View):RecyclerView.ViewHolder(listView) {
        val nameFilm: TextView = itemView.findViewById(R.id.tv_JudulFilm)
        val dateFilm: TextView = itemView.findViewById(R.id.liris)
        val ratingFilm: TextView = itemView.findViewById(R.id.rating)
        val image: ImageView = itemView.findViewById(R.id.gambar_Film)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFilm.ListViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_film,parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data =listData[position]
        with(holder){
            nameFilm.text=data.name
            dateFilm.text=data.liris
            ratingFilm.text=data.rating
            image.setImageResource(data.gambar)
        }

    }


}

