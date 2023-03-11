package com.duv.mvvmnotesapp.feature_notes.domain.use_cases

import com.duv.mvvmnotesapp.feature_notes.domain.model.Note
import com.duv.mvvmnotesapp.feature_notes.domain.repository.NoteRepository

class DeleteNoteUC(
    private val repository: NoteRepository
    ) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}