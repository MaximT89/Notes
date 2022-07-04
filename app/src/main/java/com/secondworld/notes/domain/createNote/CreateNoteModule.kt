package com.secondworld.notes.domain.createNote

import com.secondworld.notes.data.createNote.CreateNoteRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CreateNoteModule {

    @Binds
    abstract fun bindCreateNoteRepository(createNoteRepositoryImpl: CreateNoteRepositoryImpl) :
            CreateNoteRepository
}