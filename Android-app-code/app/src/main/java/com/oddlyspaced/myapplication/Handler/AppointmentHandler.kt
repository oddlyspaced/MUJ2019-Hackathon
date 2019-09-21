package com.oddlyspaced.myapplication.Handler

import android.content.Context

interface AppointmentHandler {
    fun onAccept(context: Context?)
    fun onReject(context: Context?)
}