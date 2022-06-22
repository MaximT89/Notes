package com.secondworld.notes.data.cache.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.secondworld.notes.R
import java.util.*

@Entity(tableName = "table_notes")
data class NoteModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "noteId") val noteId : Int? = null,
    @ColumnInfo(name = "noteColor") val noteColor : String? = null,
    @ColumnInfo(name = "noteText") val noteText : String = "",
    @ColumnInfo(name = "noteTitle") val noteTitle : String = "",
    @ColumnInfo(name = "noteCategory") val noteCategory : String? = null,
    @ColumnInfo(name = "noteDate") val noteDate : Date? = null
)