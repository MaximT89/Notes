package com.secondworld.notes.data.cache.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert(onConflict = REPLACE)
    suspend fun insert(noteModel: NoteModel)

    @Query("SELECT * FROM 'table_notes' WHERE noteId = :id")
    suspend fun getNoteById(id : Int) : NoteModel

    @Query("SELECT * FROM 'table_notes' WHERE noteColor = :color")
    suspend fun getNotesByColor(color : String) : List<NoteModel>

}