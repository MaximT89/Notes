package com.secondworld.notes.presentation.screens.detailNote

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.secondworld.notes.R
import com.secondworld.notes.core.BaseFragment
import com.secondworld.notes.databinding.FragmentDetailNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailNoteFragment : BaseFragment<FragmentDetailNoteBinding>(FragmentDetailNoteBinding::inflate) {

    private val viewModel by viewModels<DetailNoteViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}