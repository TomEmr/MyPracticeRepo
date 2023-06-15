package com.example.notesapp.models.dtos;

import com.example.notesapp.models.Note;

public class DeleteResponseDTO {

    private String content;

    public DeleteResponseDTO(Note note) {
        this.content = note.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
