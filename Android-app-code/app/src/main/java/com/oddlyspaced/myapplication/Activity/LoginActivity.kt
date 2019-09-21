package com.oddlyspaced.myapplication.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewDoctorLogin.setOnClickListener {
            startActivity(Intent(applicationContext, DoctorHomeActivity::class.java))
            finish()
        }
        viewPatientLogin.setOnClickListener {
            startActivity(Intent(applicationContext, PatientHomeActivity::class.java))
        }
        txSignUp.setOnClickListener {
            Toast.makeText(applicationContext, "Sign Up...", Toast.LENGTH_LONG).show()
        }
    }
}
