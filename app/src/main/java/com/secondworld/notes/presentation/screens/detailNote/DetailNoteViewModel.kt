package com.secondworld.notes.presentation.screens.detailNote

import androidx.lifecycle.ViewModel
import com.secondworld.notes.R
import com.secondworld.notes.core.BaseViewModel
import com.secondworld.notes.core.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailNoteViewModel @Inject constructor(private val resourceProvider: ResourceProvider): BaseViewModel() {
    override fun title() = resourceProvider.string(R.string.detail_note)
}