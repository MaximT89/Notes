package com.secondworld.notes.domain.createNote

import java.util.*

data class NoteDomain(
    val noteColor : String? = null,
    val noteText : String = "",
    val noteTitle : String = "",
    val noteCategory : String? = null,
    val noteDate : Date? = null
)