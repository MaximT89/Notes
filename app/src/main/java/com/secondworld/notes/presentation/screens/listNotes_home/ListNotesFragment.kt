package com.secondworld.notes.presentation.screens.listNotes_home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.secondworld.notes.R
import com.secondworld.notes.core.base.BaseFragment
import com.secondworld.notes.databinding.FragmentListNotesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListNotesFragment :
    BaseFragment<FragmentListNotesBinding, ListNotesViewModel>(FragmentListNotesBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() = with(binding) {
        btnAddNote.setOnClickListener {
            navigateTo(R.id.action_listNotesFragment_to_createNoteFragment)
        }
    }

    override fun title() = viewModel.title()
    override fun showBack(): Boolean = false
    override val viewModel: ListNotesViewModel by viewModels()
}