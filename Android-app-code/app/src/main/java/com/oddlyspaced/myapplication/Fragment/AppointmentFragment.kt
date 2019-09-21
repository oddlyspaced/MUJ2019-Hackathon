package com.oddlyspaced.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.oddlyspaced.myapplication.Adapter.AppointmentAdapter
import com.oddlyspaced.myapplication.Modal.AppointmentModal
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.dialog_appointment_add.view.*
import kotlinx.android.synthetic.main.fragment_appointment.view.*

class AppointmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_appointment, container, false)
        val list: ArrayList<AppointmentModal> = ArrayList()
        list.add(AppointmentModal("9:00"))
        list.add(AppointmentModal("9:30"))
        list.add(AppointmentModal("10:00", "10:15", "Dr. Shreeyans Bahadkar", "Fever"))
        list.add(AppointmentModal("10:30"))
        list.add(AppointmentModal("11:00"))
        list.add(AppointmentModal("11:30"))
        list.add(AppointmentModal("12:00"))
        list.add(AppointmentModal("12:30"))
        list.add(AppointmentModal("13:00"))
        list.add(AppointmentModal("13:30"))
        list.add(AppointmentModal("14:00"))
        list.add(AppointmentModal("14:30"))
        list.add(AppointmentModal("15:00"))
        list.add(AppointmentModal("15:30"))
        list.add(AppointmentModal("16:00"))
        list.add(AppointmentModal("16:30"))
        list.add(AppointmentModal("17:00"))
        list.add(AppointmentModal("17:30"))
        list.add(AppointmentModal("18:00"))
        view.rvAppointment.layoutManager = LinearLayoutManager(context)
        view.rvAppointment.adapter = AppointmentAdapter(list, context)


        val bottomSheetBehavior = BottomSheetBehavior.from(view.cvApplyapp)

        view.fabAp.setOnClickListener {
            if (bottomSheetBehavior.getState() != BottomSheetBehavior.STATE_EXPANDED) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED)
            } else {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED)
           }
        }
        view.viewApplyTouch.setOnClickListener {
            Toast.makeText(context, "Sending information...", Toast.LENGTH_LONG).show()
        }


        return view
    }
}