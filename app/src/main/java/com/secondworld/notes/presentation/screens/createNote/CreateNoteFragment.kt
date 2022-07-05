package com.secondworld.notes.presentation.screens.createNote

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.viewModels
import com.secondworld.notes.R
import com.secondworld.notes.core.base.BaseFragment
import com.secondworld.notes.databinding.FragmentCreateNoteBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@SuppressLint("SetTextI18n")
class CreateNoteFragment :
    BaseFragment<FragmentCreateNoteBinding, CreateNoteViewModel>(FragmentCreateNoteBinding::inflate) {

    override fun title() = viewModel.title()
    override val viewModel: CreateNoteViewModel by viewModels()
    var i = 6

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initObservers()

        toolbar?.setNavigationOnClickListener {
            if (i == 6){

            }  else{
                activity?.onBackPressed()
            }
        }

    }

    private fun initObservers() = with(viewModel){

        currentDate.observe(viewLifecycleOwner){
            binding.currentDateText.text = it
        }
    }
}

