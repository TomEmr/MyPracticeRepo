package com.example.notesapp.controllers;

import com.example.notesapp.models.dtos.DeleteResponseDTO;
import com.example.notesapp.models.dtos.ErrorDTO;
import com.example.notesapp.models.dtos.GetAllWithoutTypeDTO;
import com.example.notesapp.models.Note;
import com.example.notesapp.models.dtos.GetByTypeDTO;
import com.example.notesapp.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ApiController {

    private List<String> types = List.of("shopping list", "reminder", "motivational");

    private final NoteService noteService;

    @Autowired
    public ApiController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("/notes")
    public ResponseEntity<?> saveNote(@RequestBody Note note) {
        noteService.save(note);
        return ResponseEntity
                .ok()
                .body(note);
//        OR return ResponseEntity.ok(noteService.save(note) - kratší a víc cool
    }

    @GetMapping("/notes")
    public ResponseEntity<?> listByType(@RequestParam Optional<String> type) {
//        nejdřív ověřit, když je present -> není v listu types - new ErrorDTO nebo tam je noteService.listAllByType atd
//        až potom že tam není - listuju všechny bez typu
        if (type.isEmpty()) {
            return ResponseEntity
                    .ok()
                    .body(noteService.listAll().stream().map(GetAllWithoutTypeDTO::new).toList());
        }

        if (!types.contains(type.get())) {
            return ResponseEntity
                    .status(400)
                    .body(new ErrorDTO(type.get() + " type is not existing!"));
        }
        return ResponseEntity
                .ok()
                .body(noteService.listAllByType(type.get()));
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
                    .body(new DeleteResponseDTO(optional.get()));
        } else noteService.delete(id);
        return ResponseEntity
                .status(204)
                .build();
    }
}

