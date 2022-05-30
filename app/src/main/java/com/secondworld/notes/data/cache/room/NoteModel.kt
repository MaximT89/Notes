package com.secondworld.notes.data.cache.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.secondworld.notes.R
import java.util.*

@Entity(tableName = "table_notes")
data class NoteModel(
    @PrimaryKey(autoGenerate = true)
    val noteId : Int? = null,
    val noteColor : String? = null,
    val noteText : String = "",
    val noteTitle : String = "",
    val noteCategory : String? = null,
    val noteDate : Date? = null
)