package com.duv.mvvmnotesapp.feature_notes.domain.use_cases

import com.duv.mvvmnotesapp.feature_notes.domain.model.Note
import com.duv.mvvmnotesapp.feature_notes.domain.repository.NoteRepository

class GetNoteUC( private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id);
    }
}