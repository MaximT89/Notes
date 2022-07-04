package com.secondworld.notes.domain.createNote

interface CreateNoteRepository {

    suspend fun saveNote(noteDomain: NoteDomain)
}