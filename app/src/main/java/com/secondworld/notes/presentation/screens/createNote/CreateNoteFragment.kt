package com.secondworld.notes.presentation.screens.createNote

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.secondworld.notes.core.BaseFragment
import com.secondworld.notes.databinding.FragmentCreateNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateNoteFragment : BaseFragment<FragmentCreateNoteBinding>(FragmentCreateNoteBinding::inflate) {

    private val viewModel by viewModels<CreateNoteViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



    }
}