package com.secondworld.notes.presentation.screens.createNote

import androidx.fragment.app.viewModels
import com.secondworld.notes.core.base.BaseFragment
import com.secondworld.notes.databinding.FragmentCreateNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateNoteFragment :
    BaseFragment<FragmentCreateNoteBinding, CreateNoteViewModel>(FragmentCreateNoteBinding::inflate) {

    override fun title() = viewModel.title()
    override val viewModel: CreateNoteViewModel by viewModels()
}