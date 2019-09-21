package com.oddlyspaced.myapplication.Modal

data class AppointmentModal(val timeStart : String, val time : String, val doctor : String, val desc : String) {

    constructor(timeStart: String) : this(timeStart, "", "", "")
}