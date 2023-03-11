package com.duv.mvvmnotesapp.feature_notes.presentation.notes


import com.duv.mvvmnotesapp.feature_notes.domain.model.Note
import com.duv.mvvmnotesapp.feature_notes.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val NoteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
