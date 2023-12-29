package com.example.mvvmjetnote.feature_note.presentation.add_edit_note

data class NoteTextFieldSpace(
    val text: String = "",
    val hint :String = "",
    val isHintVisible: Boolean = true
) {
}