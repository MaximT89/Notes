package com.secondworld.notes.data.cache.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.secondworld.notes.R

@Entity
data class NoteModel(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val color : Int = 0
)