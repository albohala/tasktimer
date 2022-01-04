package com.afaf.tasktimer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerViewTask (private var task:ArrayList<String>):
    RecyclerView.Adapter<com.afaf.tasktimer.RecyclerViewTask.ItemViewHolder>() {
    class ItemViewHolder( val itemView: View): RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {


        holder.setIsRecyclable(false)
        val task = task[position]

        holder.itemView.apply {

            tvTitle.text = task
            chronometer.text = task

        }
    }

    override fun getItemCount(): Int = task.size

}