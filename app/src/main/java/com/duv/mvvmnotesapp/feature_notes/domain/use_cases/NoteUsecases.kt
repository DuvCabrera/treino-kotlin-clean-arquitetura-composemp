package com.duv.mvvmnotesapp.feature_notes.domain.use_cases

data class NoteUsecases(
    val getNotes: GetNotesUC,
    val deleteNote: DeleteNoteUC,
    val addNote: AddNoteUC
)
