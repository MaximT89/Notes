package com.secondworld.notes.domain.createNote

import javax.inject.Inject

class SaveNoteUseCase @Inject constructor(private val repository: CreateNoteRepository) {

    suspend fun saveNote(noteDomain: NoteDomain) = repository.saveNote(noteDomain)
}