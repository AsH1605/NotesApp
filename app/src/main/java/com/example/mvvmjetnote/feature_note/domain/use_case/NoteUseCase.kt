package com.example.mvvmjetnote.feature_note.domain.use_case

data class NoteUseCase(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNote: AddNote
)

//dependency injection is giving variable to an instance of object
