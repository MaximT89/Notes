package com.secondworld.notes.presentation.screens.createNote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.secondworld.notes.R
import com.secondworld.notes.core.base.BaseViewModel
import com.secondworld.notes.core.common.ResourceProvider
import com.secondworld.notes.core.extension.currentDate
import com.secondworld.notes.domain.createNote.NoteDomain
import com.secondworld.notes.domain.createNote.SaveNoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class CreateNoteViewModel @Inject constructor(
    private val resourceProvider: ResourceProvider,
    private val saveNoteUseCase: SaveNoteUseCase
) : BaseViewModel() {
    override fun title() = resourceProvider.string(R.string.creater_note)

    private var note = NoteDomain(
        null,
        "",
        resourceProvider.string(R.string.new_note),
        null,
        Date()
    )

    private var _currentDate = MutableLiveData<String>()
    val currentDate: LiveData<String> = _currentDate

    private var _error = MutableLiveData<String>()
    val error: LiveData<String> = _error

    init {
        getTextCurrentDate()
    }

    fun saveNote() {
        if (note.noteText == "") {
            _error.value = resourceProvider.string(R.string.note_text_empty)
        } else {
            viewModelScope.launch(Dispatchers.IO) {
                saveNoteUseCase.saveNote(note)
            }
        }
    }

    fun getTextCurrentDate() {
        _currentDate.value =
            resourceProvider.string(R.string.current_date) + " " + note.noteDate!!.currentDate()
    }
}