package com.secondworld.notes.presentation

import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.findNavController
import com.secondworld.notes.R
import com.secondworld.notes.core.base.BaseActivity
import com.secondworld.notes.core.extension.log
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    var callBackU : (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.nav_host_fragment).navigateUp()
    }
}