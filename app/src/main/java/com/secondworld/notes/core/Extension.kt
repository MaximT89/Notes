package com.secondworld.notes.core

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.app.Activity
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.Log
import android.view.View
import android.widget.TextView
import android.content.res.Resources
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

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

fun createGradient(textView: TextView, colors: IntArray) {
    val paint = textView.paint
    val width = paint.measureText(textView.text.toString())
    val textShader: Shader = LinearGradient(0f, 0f, width, textView.textSize, colors, null, Shader.TileMode.REPEAT)
    textView.paint.shader = textShader
}

fun Int.toDp() : Int = (this / Resources.getSystem().displayMetrics.density).toInt()
fun Int.toPx() : Int = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Activity.snackbar(message: String) {
    Snackbar.make(this, findViewById(android.R.id.content) , message, Snackbar.LENGTH_LONG ).show()
}

fun View.animateLikeButton() {
    setOnClickListener {
        AnimatorSet().apply {
            playTogether(
                ObjectAnimator.ofFloat(it, View.SCALE_X, 1f, 0.95f, 1f),
                ObjectAnimator.ofFloat(it, View.SCALE_Y, 1f, 0.95f, 1f)
            )
            duration = 100
            start()
        }
    }
}

fun String.upperFirst() = this.substring(0, 1).uppercase() + this.drop(1)

fun Activity.hideSoftKeyboard() {
    currentFocus?.let {
        val inputMethodManager = ContextCompat.getSystemService(this, InputMethodManager::class.java)!!
        inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
    }
}
