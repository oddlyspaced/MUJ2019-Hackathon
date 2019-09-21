package com.oddlyspaced.myapplication.Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.oddlyspaced.myapplication.Adapter.RequestAppointAdapter
import com.oddlyspaced.myapplication.Handler.AppointmentHandler
import com.oddlyspaced.myapplication.Modal.AppointmentRequestModal
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.fragment_doc_app_req.view.*

class AppointmentRequestFragment :Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view : View = layoutInflater.inflate(R.layout.fragment_doc_app_req, container, false)
        val list : ArrayList<AppointmentRequestModal> = ArrayList()
        val handle = handle()
        list.add(AppointmentRequestModal("12:30", "Hardik Srivastava", "Fever", handle))
        list.add(AppointmentRequestModal("5:30", "Ritik Aggarwal", "Cough", handle))
        view.rvDocAppointments.setHasFixedSize(true)
        view.rvDocAppointments.layoutManager = LinearLayoutManager(context)
        view.rvDocAppointments.adapter = RequestAppointAdapter(list, context)
        return view

    }

    class handle : AppointmentHandler {
        override fun onAccept(context: Context?) {
            Toast.makeText(context, "Accepted!", Toast.LENGTH_LONG).show()
        }

        override fun onReject(context: Context?) {
            Toast.makeText(context, "Rejected!", Toast.LENGTH_LONG).show()
        }
    }

}