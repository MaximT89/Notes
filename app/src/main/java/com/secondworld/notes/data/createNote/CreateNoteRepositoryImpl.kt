package com.secondworld.notes.data.createNote

import com.secondworld.notes.data.cache.room.NoteDao
import com.secondworld.notes.domain.createNote.CreateNoteRepository
import com.secondworld.notes.domain.createNote.NoteDomain
import javax.inject.Inject

class CreateNoteRepositoryImpl @Inject constructor(
    private val dao: NoteDao,
    private val mapper : NoteDomainToNoteDataMapper
) : CreateNoteRepository {

    override suspend fun saveNote(noteDomain: NoteDomain) {
        dao.saveNote(mapper.map(noteDomain))
    }
}