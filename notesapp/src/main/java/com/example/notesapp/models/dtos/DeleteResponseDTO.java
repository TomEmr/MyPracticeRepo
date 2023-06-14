package com.example.notesapp.models.dtos;

public class DeleteResponseDTO {

    private String content;

    public DeleteResponseDTO(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
