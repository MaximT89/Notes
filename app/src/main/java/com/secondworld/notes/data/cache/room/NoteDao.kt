package com.secondworld.notes.data.cache.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update

@Dao
interface NoteDao {

    @Insert(onConflict = REPLACE, entity = NoteModel::class)
    suspend fun saveNote(noteModel: NoteModel)

    @Query("SELECT * FROM 'table_notes' WHERE noteId = :id")
    suspend fun getNoteById(id : Int) : NoteModel

    @Query("SELECT * FROM 'table_notes' WHERE noteColor = :color")
    suspend fun getNotesByColor(color : String) : List<NoteModel>

    @Update(entity = NoteModel::class)
    suspend fun updateNote(noteModel: NoteModel)
}