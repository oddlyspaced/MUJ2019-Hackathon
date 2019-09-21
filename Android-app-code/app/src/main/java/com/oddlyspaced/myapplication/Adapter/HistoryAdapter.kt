package com.oddlyspaced.myapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.oddlyspaced.myapplication.Modal.HistoryModal
import com.oddlyspaced.myapplication.R

class HistoryAdapter(val list : ArrayList<HistoryModal>, val context : Context?) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_history, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item : HistoryModal = list.get(position)
            holder.time.text = item.time
            holder.desc.text = item.desc
            holder.doctor.text = item.doctor
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val time : TextView = itemView.findViewById(R.id.txHiTime)
        val doctor : TextView = itemView.findViewById(R.id.txHiDr)
        val desc : TextView = itemView.findViewById(R.id.txHiDesc)

    }

}