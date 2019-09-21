package com.oddlyspaced.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oddlyspaced.myapplication.Fragment.AppointmentFragment
import com.oddlyspaced.myapplication.Fragment.HistoryFragment
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.activity_home.*

class PatientHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val frag = AppointmentFragment()
        val manager = supportFragmentManager
        val trans = manager.beginTransaction()
        trans.replace(R.id.clFragment, frag)
        trans.commit()


        viewTouchHi.setOnClickListener {
            val frag = HistoryFragment()
            val manager = supportFragmentManager
            val trans = manager.beginTransaction()
            trans.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            trans.replace(R.id.clFragment, frag)
            trans.commit()
        }
        viewTouchAp.setOnClickListener {
            val frag = AppointmentFragment()
            val manager = supportFragmentManager
            val trans = manager.beginTransaction()
            trans.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            trans.replace(R.id.clFragment, frag)
            trans.commit()
        }
    }
}
