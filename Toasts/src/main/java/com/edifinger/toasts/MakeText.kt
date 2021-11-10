package com.edifinger.toasts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

object MakeText {
    fun danger(ctx: Context, message:String){
        val inflater = LayoutInflater.from(ctx)
        val view: View = inflater.inflate(R.layout.custom_toast_danger, null)
        val toast = Toast(ctx)
        view.findViewById<TextView>(R.id.tv_title).text = message
        toast.view = view
        toast.duration = Toast.LENGTH_LONG
        toast.show()
    }
}