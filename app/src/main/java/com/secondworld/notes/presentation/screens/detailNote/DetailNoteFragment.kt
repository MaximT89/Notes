package com.secondworld.notes.presentation.screens.detailNote

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.secondworld.notes.core.base.BaseFragment
import com.secondworld.notes.databinding.FragmentDetailNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailNoteFragment : BaseFragment<FragmentDetailNoteBinding>(FragmentDetailNoteBinding::inflate) {

    private val viewModel by viewModels<DetailNoteViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun title() = viewModel.title()
}