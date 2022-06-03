package com.secondworld.notes.di

import android.content.Context
import androidx.room.Room
import com.secondworld.notes.data.cache.room.AppDatabase
import com.secondworld.notes.data.cache.room.MIGRATION_1_2
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModuleProvides {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context : Context) : AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "note_db")
            .addMigrations(MIGRATION_1_2).build()

    @Provides
    @Singleton
    fun provideNoteDao(appDatabase: AppDatabase) = appDatabase.noteDao()
}