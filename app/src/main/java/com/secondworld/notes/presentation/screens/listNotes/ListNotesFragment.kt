package com.secondworld.notes.presentation.screens.listNotes

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.secondworld.notes.R
import com.secondworld.notes.core.BaseFragment
import com.secondworld.notes.core.log
import com.secondworld.notes.databinding.FragmentListNotesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListNotesFragment : BaseFragment<FragmentListNotesBinding>(FragmentListNotesBinding::inflate) {

    private val viewModel by viewModels<ListNotesViewModel>()

    override fun showBack(): Boolean = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        binding.btnAddNote.setOnClickListener{
            findNavController().navigate(R.id.action_listNotesFragment_to_createNoteFragment)
        }
    }

    override fun title() = viewModel.title()

}