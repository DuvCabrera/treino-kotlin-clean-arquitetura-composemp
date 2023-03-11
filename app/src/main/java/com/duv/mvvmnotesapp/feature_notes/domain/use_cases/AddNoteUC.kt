package com.duv.mvvmnotesapp.feature_notes.domain.use_cases

import com.duv.mvvmnotesapp.feature_notes.domain.model.InvalidNoteException
import com.duv.mvvmnotesapp.feature_notes.domain.model.Note
import com.duv.mvvmnotesapp.feature_notes.domain.repository.NoteRepository

class AddNoteUC(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty!")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty!")

        }
        repository.insertNote(note)
    }
}