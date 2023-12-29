package com.example.mvvmjetnote.feature_note.domain.use_case

data class NoteUseCase(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNote: AddNote,
    val getNote: GetNote
)

//dependency injection is giving variable to an instance of object
