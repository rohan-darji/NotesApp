package com.example.notesapp.data

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

interface NoteDao {

    @Upsert
    suspend fun upsertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM note ORDER BY title ASC")
    fun getOrderedByTitle(): Flow<List<Note>>

    @Query("SELECT * FROM note ORDER BY dataAdded")
    fun getOrderedByDateAdded(): Flow<List<Note>>
}