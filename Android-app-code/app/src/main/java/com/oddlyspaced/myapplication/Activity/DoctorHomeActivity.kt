package com.oddlyspaced.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oddlyspaced.myapplication.Adapter.RequestAppointAdapter
import com.oddlyspaced.myapplication.Fragment.AppointmentFragment
import com.oddlyspaced.myapplication.Fragment.AppointmentRequestFragment
import com.oddlyspaced.myapplication.Fragment.HistoryFragment
import com.oddlyspaced.myapplication.Fragment.ScheduledFragment
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.activity_doctor_home.*
import kotlinx.android.synthetic.main.activity_home.*

class DoctorHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_home)

        val frag = ScheduledFragment()
        val manager = supportFragmentManager
        val trans = manager.beginTransaction()
        trans.replace(R.id.clDoctorFragment, frag)
        trans.commit()


        viewDocPendingTouch.setOnClickListener {
            val frag = AppointmentRequestFragment()
            val manager = supportFragmentManager
            val trans = manager.beginTransaction()
            trans.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            trans.replace(R.id.clDoctorFragment, frag)
            trans.commit()
        }
        viewDocSchedTouch.setOnClickListener {
            val frag = ScheduledFragment()
            val manager = supportFragmentManager
            val trans = manager.beginTransaction()
            trans.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            trans.replace(R.id.clDoctorFragment, frag)
            trans.commit()
        }
    }
}
