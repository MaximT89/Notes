package com.secondworld.notes.core.base

interface Mapper<T, R> {

    fun map(data: T): R
}