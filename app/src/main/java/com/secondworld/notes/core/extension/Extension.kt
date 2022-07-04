package com.secondworld.notes.core.extension

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

fun updateText(view: TextView, message: Any) {
    view.text = message.toString()
}

fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun View.enabled() {
    isEnabled = true
    isClickable = true
}

fun View.notEnabled() {
    isEnabled = false
    isClickable = false
}

fun showViews(vararg views: View) {
    for (view in views) view.visibility = View.VISIBLE
}

fun hideViews(vararg views: View) {
    for (view in views) view.visibility = View.GONE
}

fun log(message : String){
    Log.d("TAG", "log: $message")
}

@SuppressLint("SimpleDateFormat")
fun Date.currentDate() : String {
    return SimpleDateFormat("dd.MM.yyyyг. hh:mm:ss").format(Date()).toString()
}