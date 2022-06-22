package com.secondworld.notes.presentation.screens.detailNote

import androidx.fragment.app.viewModels
import com.secondworld.notes.core.base.BaseFragment
import com.secondworld.notes.databinding.FragmentDetailNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailNoteFragment : BaseFragment<FragmentDetailNoteBinding, DetailNoteViewModel>(FragmentDetailNoteBinding::inflate) {

    override fun title() = viewModel.title()
    override val viewModel: DetailNoteViewModel by viewModels()
}