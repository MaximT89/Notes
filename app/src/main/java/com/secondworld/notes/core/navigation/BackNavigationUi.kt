package com.secondworld.notes.core.navigation

interface BackNavigationUi {

    /**
     * На всех экранах отображаем кнопку назад, кроме стартового экрана
     */
    fun showBack() : Boolean
}