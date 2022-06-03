package com.secondworld.notes.data.cache.room

import android.annotation.SuppressLint
import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.*

class DateConverter {

    @SuppressLint("SimpleDateFormat")
    val formatter = SimpleDateFormat("dd.MM.yyyyг. hh:mm:ss")

    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    fun dateToTimestampCustom(date: Date?): String {
        return formatter.format(date).toString()
    }
}