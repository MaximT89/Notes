package com.secondworld.notes.presentation.screens.createNote

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.viewModels
import com.secondworld.notes.core.BaseFragment
import com.secondworld.notes.core.hideSoftKeyboard
import com.secondworld.notes.databinding.FragmentCreateNoteBinding
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class CreateNoteFragment :
    BaseFragment<FragmentCreateNoteBinding>(FragmentCreateNoteBinding::inflate) {

    private val viewModel by viewModels<CreateNoteViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().hideSoftKeyboard()
    }

    override fun title(): String {
        return viewModel.title()
    }
}