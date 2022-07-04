package com.secondworld.notes.data.createNote

import com.secondworld.notes.core.base.Mapper
import com.secondworld.notes.data.cache.room.NoteModel
import com.secondworld.notes.domain.createNote.NoteDomain
import javax.inject.Inject

class NoteDomainToNoteDataMapper @Inject constructor() : Mapper<NoteDomain, NoteModel> {
    override fun map(data: NoteDomain): NoteModel {
        return NoteModel(
            0,
            data.noteColor,
            data.noteText,
            data.noteTitle,
            data.noteCategory,
            data.noteDate
        )
    }
}