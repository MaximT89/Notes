package com.secondworld.notes.presentation.screens.listNotes

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.secondworld.notes.R
import com.secondworld.notes.core.BaseFragment
import com.secondworld.notes.data.cache.room.DateConverter
import com.secondworld.notes.data.cache.room.NoteDao
import com.secondworld.notes.data.cache.room.NoteModel
import com.secondworld.notes.databinding.FragmentListNotesBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import kotlin.time.Duration.Companion.days
import kotlin.time.days

@AndroidEntryPoint
class ListNotesFragment :
    BaseFragment<FragmentListNotesBinding>(FragmentListNotesBinding::inflate) {

    private val viewModel by viewModels<ListNotesViewModel>()

    @Inject
    lateinit var noteDao: NoteDao

    @SuppressLint("SimpleDateFormat")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleScope.launch {
            noteDao.insert(NoteModel(0, null, "hi", "hi", null, Date()))
            val note = noteDao.getNoteById(1)

            binding.textDate.text = DateConverter().dateToTimestampCustom(note.noteDate)
        }
    }
}