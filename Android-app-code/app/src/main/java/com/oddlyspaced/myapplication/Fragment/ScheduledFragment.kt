package com.oddlyspaced.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.oddlyspaced.myapplication.Adapter.ScheduledAdapter
import com.oddlyspaced.myapplication.Modal.ScheduledModal
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.fragment_scheduled.view.*

class ScheduledFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view : View = layoutInflater.inflate(R.layout.fragment_scheduled, container, false)
        val list : ArrayList<ScheduledModal> = ArrayList()
        //val handle = AppointmentRequestFragment.handle()
        list.add(ScheduledModal("12:30", "Hardik Srivastava", "Fever"))
        list.add(ScheduledModal("5:30", "Prajjwal Pathak", "Cough Cough"))
        view.rvDocScheduled.setHasFixedSize(true)
        view.rvDocScheduled.layoutManager = LinearLayoutManager(context)
        view.rvDocScheduled.adapter = ScheduledAdapter(list, context)
        return view

    }

}