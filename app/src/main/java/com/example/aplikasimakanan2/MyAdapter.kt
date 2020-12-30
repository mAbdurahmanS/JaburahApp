package com.example.aplikasimakanan2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(model: Model){

            itemView.tv_judul.text = model.title
            itemView.tv_deskripsi.text = model.desc
            itemView.tv_harga.text = model.price
            itemView.img_view.setImageResource(model.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            val  model = arrayList.get(position)

            var gTitle : String = model.title
            var gDescription : String = model.desc
            var gPrice : String = model.price
            var gImg : Int = model.image

            val intent = Intent(context, intent_view::class.java)

            intent.putExtra("iTitle", gTitle)
            intent.putExtra("iDesc", gDescription)
            intent.putExtra("iPrice", gPrice)
            intent.putExtra("iImg", gImg)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}