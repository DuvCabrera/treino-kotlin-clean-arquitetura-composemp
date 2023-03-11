package com.duv.mvvmnotesapp.feature_notes.presentation.add_edit_note

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import com.duv.mvvmnotesapp.feature_notes.domain.model.Note
import com.duv.mvvmnotesapp.feature_notes.domain.use_cases.NoteUsecases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import javax.inject.Inject

@HiltViewModel
class AddEditNoteViewModel @Inject constructor(
    private val noteUsecases: NoteUsecases
) : ViewModel() {

    private val _noteTitle = mutableStateOf(NoteTextFieldState())
    val noteTitle : State<NoteTextFieldState> = _noteTitle

    private val _noteContentTitle = mutableStateOf(NoteTextFieldState())
    val noteContentTitle : State<NoteTextFieldState> = _noteContentTitle

    private val _noteColor = mutableStateOf(Note.noteColors.random().toArgb())
    val noteColor: State<Int> = _noteColor


}