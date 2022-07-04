package com.secondworld.notes.data.cache.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [NoteModel::class], version = 1, exportSchema = false)
@TypeConverters(TypeConverterDate::class)
abstract class AppDatabase : RoomDatabase(){
    abstract fun noteDao() : NoteDao
}