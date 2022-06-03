package com.secondworld.notes.core

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    abstract fun title() : String
}