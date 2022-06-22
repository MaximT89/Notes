package com.secondworld.notes.presentation.screens.detailNote

import com.secondworld.notes.R
import com.secondworld.notes.core.base.BaseViewModel
import com.secondworld.notes.core.common.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailNoteViewModel @Inject constructor(private val resourceProvider: ResourceProvider): BaseViewModel() {
    override fun title() = resourceProvider.string(R.string.detail_note)
}