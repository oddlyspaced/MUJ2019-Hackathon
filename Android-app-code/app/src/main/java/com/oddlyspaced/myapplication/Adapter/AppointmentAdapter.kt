package com.oddlyspaced.myapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.oddlyspaced.myapplication.Modal.AppointmentModal
import com.oddlyspaced.myapplication.R

class AppointmentAdapter(val list : ArrayList<AppointmentModal>, val context : Context?) : RecyclerView.Adapter<AppointmentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_appointment, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item : AppointmentModal = list.get(position)
        holder.timeStart.text = item.timeStart
        if (item.desc.isNotEmpty()) {
            holder.time.text = item.time
            holder.desc.text = item.desc
            holder.doctor.text = item.doctor
            holder.design.isVisible = true
            holder.time.isVisible = true
            holder.desc.isVisible = true
            holder.doctor.isVisible = true
        }

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val design : CardView = itemView.findViewById(R.id.cvApDesign)
        val timeStart : TextView = itemView.findViewById(R.id.txApTimeStart)
        val time : TextView = itemView.findViewById(R.id.txApTime)
        val doctor : TextView = itemView.findViewById(R.id.txApDr)
        val desc : TextView = itemView.findViewById(R.id.txApDesc)

    }

}