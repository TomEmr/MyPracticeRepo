package com.example.notesapp.models.dtos;

public class ErrorDTO {

    private String error;

    public ErrorDTO(String message) {
        this.error = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
