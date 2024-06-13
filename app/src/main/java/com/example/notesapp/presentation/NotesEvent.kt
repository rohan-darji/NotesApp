package com.example.notesapp.presentation

import com.example.notesapp.data.Note

sealed interface NotesEvent {
    object SortNotes: NotesEvent
    data class DeleteNote(val note: Note): NotesEvent
    data class SaveNote(var title: String, var description: String): NotesEvent
}