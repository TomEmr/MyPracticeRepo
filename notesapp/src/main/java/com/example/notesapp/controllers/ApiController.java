package com.example.notesapp.controllers;

import com.example.notesapp.models.dtos.DeleteResponseDTO;
import com.example.notesapp.models.dtos.ErrorDTO;
import com.example.notesapp.models.dtos.GetAllNotesDTO;
import com.example.notesapp.models.Note;
import com.example.notesapp.models.dtos.GetByTypeDTO;
import com.example.notesapp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final NoteService noteService;

    @Autowired
    public ApiController(NoteService noteService) {
        this.noteService = noteService;
    }

//dát get do jednoho endpointu
//    @GetMapping("/notes")
//    public ResponseEntity<?> listAll() {
// return null;
//    }

    @PostMapping("/notes")
    public ResponseEntity<?> saveNote(@RequestBody Note note) {
        noteService.save(note);
        return ResponseEntity
                .ok()
                .body(note);
    }

    @GetMapping("/notes")
    public ResponseEntity<?> listByType(@RequestParam Optional<String> type) {
        if (type.isEmpty()) {
            return ResponseEntity
                    .ok()
                    .body(noteService.listAll().stream().map(GetAllNotesDTO::new).toList());
        }
        List<String> types = Arrays.asList("shopping list", "reminder", "motivational");
        if (!types.contains(type.get())) {
            return ResponseEntity
                    .status(400)
                    .body(new ErrorDTO(type.get() + " type is not existing!"));
        } else
            return ResponseEntity
                    .ok()
                    .body(noteService.listAllByType(type.get())
                            .stream()
                            .map(GetByTypeDTO::new)
                            .toList());
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable Long id) {
        Optional<Note> optional = noteService.findById(id);
        if (optional.isEmpty()) {
            return ResponseEntity
                    .status(400)
                    .build();
        }
        if (optional.get().getType().equals("shopping list") ||
                optional.get().getType().equals("reminder")) {
            noteService.delete(id);
            return ResponseEntity
                    .status(200)
                    .body(new DeleteResponseDTO(optional.get().getContent()));
        } else noteService.delete(id);
        return ResponseEntity
                .status(204)
                .build();
    }
}

