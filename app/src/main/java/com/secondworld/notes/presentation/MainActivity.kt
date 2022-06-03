package com.secondworld.notes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.secondworld.notes.R
import com.secondworld.notes.core.ResourceProvider
import com.secondworld.notes.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}