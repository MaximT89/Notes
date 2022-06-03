package com.secondworld.notes.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<B : ViewBinding>(private val inflate: Inflate<B>) : Fragment(), BackNavigationUi{

    private var _viewBinding : B? = null
    protected val binding get() = checkNotNull(_viewBinding)

    override fun showBack(): Boolean = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.apply {
            title = title()
            setDisplayHomeAsUpEnabled(showBack())
        }

        requireActivity().hideSoftKeyboard()
    }

    abstract fun title() : String

    override fun onDestroy() {
        super.onDestroy()
        _viewBinding = null
    }
}