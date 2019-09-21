package com.oddlyspaced.myapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.transition.Visibility
import com.oddlyspaced.myapplication.Modal.AppointmentRequestModal
import com.oddlyspaced.myapplication.R

class RequestAppointAdapter(val list : ArrayList<AppointmentRequestModal>, val context : Context?) : RecyclerView.Adapter<RequestAppointAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_doc, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item : AppointmentRequestModal= list.get(position)

        holder.accept.isVisible = true
        holder.reject.isVisible = true
        holder.time.text = item.time
        holder.patient.text = item.name
        holder.desc.text = item.desc
        holder.acceptTouch.setOnClickListener {
            item.handler.onAccept(context)
        }
        holder.rejectTouch.setOnClickListener {
            item.handler.onReject(context)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val time : TextView = itemView.findViewById(R.id.txDocAp)
        val patient : TextView = itemView.findViewById(R.id.txApHiPat)
        val desc : TextView = itemView.findViewById(R.id.txApHiDesc)
        val accept : CardView = itemView.findViewById(R.id.cvDocApAccept)
        val reject : CardView = itemView.findViewById(R.id.cvDocApReject)
        val acceptTouch : View = itemView.findViewById(R.id.viewDocAcceptTouch)
        val rejectTouch : View = itemView.findViewById(R.id.viewDocRejectTouch)
    }

}