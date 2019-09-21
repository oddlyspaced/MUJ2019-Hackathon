package com.oddlyspaced.myapplication.Modal

import com.oddlyspaced.myapplication.Handler.AppointmentHandler

data class AppointmentRequestModal (val time : String, val name : String, val desc : String, val handler : AppointmentHandler)