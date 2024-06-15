package com.example.notesapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (

    @PrimaryKey(autoGenerate = true)
    val title: String,
    val description: String,
    val dateAdded: Long
)