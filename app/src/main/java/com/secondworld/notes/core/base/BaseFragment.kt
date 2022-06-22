package com.secondworld.notes.core.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.secondworld.notes.core.navigation.BackNavigationUi
import com.secondworld.notes.core.navigation.Navigator

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<B : ViewBinding>(private val inflate: Inflate<B>) : Fragment(),
    BackNavigationUi, Navigator {

    private var _viewBinding: B? = null
    protected val binding get() = checkNotNull(_viewBinding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _viewBinding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun showBack() = true

    /**
     * Выносим логику навигации в базовый фрагмент, во фрагментах используем метод [navigateTo]
     */
    override fun navigateTo(resId: Int, args: Bundle?, navOptions: NavOptions?) =
        findNavController().navigate(resId, args, navOptions)

    override fun navigateTo(resId: Int) =
        findNavController().navigate(resId)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.apply {
            title = title()
            setDisplayHomeAsUpEnabled(showBack())
        }
    }

    /**
     * На каждом фрагменте обязательно нужно переопределить title, который отображается в actionBar
     */
    abstract fun title(): String

    override fun onDestroy() {
        super.onDestroy()
        _viewBinding = null
    }
}