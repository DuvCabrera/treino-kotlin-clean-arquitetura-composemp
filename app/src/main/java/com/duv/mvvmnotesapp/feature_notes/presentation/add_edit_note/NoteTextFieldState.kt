package com.duv.mvvmnotesapp.feature_notes.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hintText: String = "",
    val isHintVisible: Boolean = true
)
