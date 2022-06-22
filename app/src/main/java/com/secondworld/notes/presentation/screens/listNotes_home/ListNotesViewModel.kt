package com.secondworld.notes.presentation.screens.listNotes_home

import androidx.lifecycle.ViewModel
import com.secondworld.notes.R
import com.secondworld.notes.core.common.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListNotesViewModel @Inject constructor(private val resourceProvider: ResourceProvider): ViewModel() {
    fun title() = resourceProvider.string(R.string.notes)
}